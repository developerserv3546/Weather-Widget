package com.developer35.serega.weatherwidget;


import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

import com.developer35.serega.weatherwidget.entities.WeatherEntity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherWidget extends AppWidgetProvider {

    private static final String TAG = "WeatherWidget";

    @Override
    public void onUpdate(final Context context, final AppWidgetManager appWidgetManager, final int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);

        final Intent intent = new Intent(context, WeatherWidget.class);
        intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);

        WeatherApi weatherApi = Fabric.getWeatherApi();
        Call<WeatherEntity> call = weatherApi
                .getForecast(context.getString(R.string.key_wunderground_com));

        call.enqueue(new Callback<WeatherEntity>() {
            @Override
            public void onResponse(Call<WeatherEntity> call, Response<WeatherEntity> response) {
                if (response.isSuccessful()) {
                    WeatherEntity entity = response.body();
                    if (entity != null) {

                        String temperature = getTemperature(entity);
                        String location = getLocation(entity);
                        RemoteViews remoteViews;

                        for (final int id : appWidgetIds) {
                            remoteViews = new RemoteViews(context.getPackageName(),
                                    R.layout.widget);

                            remoteViews.setTextViewText(R.id.txt_location, location);
                            remoteViews.setTextViewText(R.id.txt_temperature, temperature);

                            PendingIntent pendingIntent = PendingIntent.getBroadcast(context,
                                    0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

                            remoteViews.setOnClickPendingIntent(R.id.btn_refresh, pendingIntent);
                            appWidgetManager.updateAppWidget(id, remoteViews);
                        }
                    } else {
                        Log.e(TAG, "WeatherEntity is null!");
                    }
                } else {
                    Log.e(TAG, "Response is not successful! Code: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<WeatherEntity> call, Throwable t) {
                Log.e(TAG, "Response failed!");
                t.printStackTrace();
            }
        });
    }

    private String getTemperature(WeatherEntity weatherEntity) {
        return weatherEntity.getCurrentObservationEntity()
                .getTemperatureString();
    }

    private String getLocation(WeatherEntity weatherEntity) {
        return weatherEntity.getCurrentObservationEntity()
                .getDisplayLocationEntity()
                .getFull();
    }

}
