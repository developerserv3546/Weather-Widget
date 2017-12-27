package com.developer35.serega.weatherwidget;


import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

import com.developer35.serega.weatherwidget.entities.WeatherEntity;

import java.util.Calendar;
import java.util.TimeZone;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherWidget extends AppWidgetProvider {

    private static final String TAG = "WeatherWidget";
    private static final String FAHRENHEIT = " F";

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
            dayOfMonth = getDayOfMonth();
            month = getMonth(context);
            temperature = getTemperature(entity);
            location = getLocation(entity);
        }


        for (final int id : ids) {
            final RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
                    R.layout.widget);

            if (entity != null) {
                remoteViews.setTextViewText(R.id.txt_day_of_month, dayOfMonth);
                remoteViews.setTextViewText(R.id.txt_month, month);
                remoteViews.setTextViewText(R.id.txt_location, location);
                remoteViews.setTextViewText(R.id.txt_temperature, temperature);
            }

            final Intent intent = new Intent(context, WeatherWidget.class);
            intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, ids);

            PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);

            remoteViews.setOnClickPendingIntent(R.id.btn_refresh, pendingIntent);
            appWidgetManager.updateAppWidget(new ComponentName(context, WeatherWidget.class), remoteViews);
        }

    }

    private String getDayOfMonth() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        return String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
    }

    private String getMonth(Context context) {

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int month = calendar.get(Calendar.MONTH);

        switch (month) {
            case Calendar.JANUARY:
                return context.getString(R.string.january);
            case Calendar.FEBRUARY:
                return context.getString(R.string.february);
            case Calendar.MARCH:
                return context.getString(R.string.march);
            case Calendar.APRIL:
                return context.getString(R.string.april);
            case Calendar.MAY:
                return context.getString(R.string.may);
            case Calendar.JUNE:
                return context.getString(R.string.june);
            case Calendar.JULY:
                return context.getString(R.string.july);
            case Calendar.AUGUST:
                return context.getString(R.string.august);
            case Calendar.SEPTEMBER:
                return context.getString(R.string.september);
            case Calendar.OCTOBER:
                return context.getString(R.string.october);
            case Calendar.NOVEMBER:
                return context.getString(R.string.november);
            case Calendar.DECEMBER:
                return context.getString(R.string.december);
            default:
                return context.getString(R.string.undefined);
        }
    }

    private String getTemperature(WeatherEntity weatherEntity) {
        return String.valueOf(weatherEntity.getCurrentObservationEntity()
                .getTempF()) + FAHRENHEIT;
    }

    private String getLocation(WeatherEntity weatherEntity) {
        return weatherEntity.getCurrentObservationEntity()
                .getDisplayLocationEntity()
                .getFull();
    }

}
