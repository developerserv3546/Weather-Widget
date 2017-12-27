package com.developer35.serega.weatherwidget.widgets;


import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

import com.developer35.serega.weatherwidget.Fabric;
import com.developer35.serega.weatherwidget.R;
import com.developer35.serega.weatherwidget.apis.WeatherApi;
import com.developer35.serega.weatherwidget.entities.WeatherEntity;
import com.developer35.serega.weatherwidget.utils.StringHelper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherWidget extends AppWidgetProvider {

    private static final String TAG = "WeatherWidget";

    @Override
    public void onUpdate(final Context context, final AppWidgetManager appWidgetManager, final int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);

        WeatherApi weatherApi = Fabric.getWeatherApi();
        Call<WeatherEntity> call = weatherApi
                .getForecast(context.getString(R.string.key_wunderground_com));

        call.enqueue(new Callback<WeatherEntity>() {
            @Override
            public void onResponse(Call<WeatherEntity> call, Response<WeatherEntity> response) {

                WeatherEntity entity = null;

                if (response.isSuccessful()) {
                    entity = response.body();
                    if (entity == null) {
                        Log.e(TAG, "WeatherEntity is null!");
                    }
                } else {
                    Log.e(TAG, "Response error! Code: " + response.code());
                }
                update(context, entity, appWidgetManager, appWidgetIds);
            }

            @Override
            public void onFailure(Call<WeatherEntity> call, Throwable t) {
                update(context, null, appWidgetManager, appWidgetIds);
                Log.e(TAG, "Response failed!");
                t.printStackTrace();
            }
        });
    }

    private void update(Context context, WeatherEntity entity, AppWidgetManager appWidgetManager, int[] ids) {

        String dayOfMonth = null;
        String month = null;
        String temperature = null;
        String location = null;

        if (entity != null) {
            dayOfMonth = StringHelper.getDayOfMonth();
            month = StringHelper.getMonth(context);
            temperature = StringHelper.getTemperature(entity);
            location = StringHelper.getLocation(entity);
        }

        for (int id : ids) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
                    R.layout.widget);

            if (entity != null) {
                updateRemoteViews(remoteViews, dayOfMonth, month, location, temperature);
            }

            PendingIntent pendingIntent = getPendingIntent(context, ids);
            remoteViews.setOnClickPendingIntent(R.id.btn_refresh, pendingIntent);
            appWidgetManager.updateAppWidget(new ComponentName(context, WeatherWidget.class), remoteViews);
        }

    }

    private void updateRemoteViews(RemoteViews remoteViews, String dayOfMonth, String month, String location, String temperature) {
        remoteViews.setTextViewText(R.id.txt_day_of_month, dayOfMonth);
        remoteViews.setTextViewText(R.id.txt_month, month);
        remoteViews.setTextViewText(R.id.txt_location, location);
        remoteViews.setTextViewText(R.id.txt_temperature, temperature);
    }

    private PendingIntent getPendingIntent(Context context, int[] ids) {
        Intent intent = new Intent(context, WeatherWidget.class);
        intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
        intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, ids);
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }

}
