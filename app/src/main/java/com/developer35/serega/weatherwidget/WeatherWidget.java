package com.developer35.serega.weatherwidget;


import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.util.Log;

import com.developer35.serega.weatherwidget.entities.WeatherEntity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherWidget extends AppWidgetProvider {

    private static final String TAG = "WeatherWidget";

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);

        WeatherApi weatherApi = Fabric.getWeatherApi();
        Call<WeatherEntity> call = weatherApi.getForecast();

        call.enqueue(new Callback<WeatherEntity>() {
            @Override
            public void onResponse(Call<WeatherEntity> call, Response<WeatherEntity> response) {
                if (response.isSuccessful()) {
                    WeatherEntity weatherEntity = response.body();
                    if (weatherEntity != null) {

                        /**TODO
                         *
                         *
                         */

                    } else {
                        Log.e(TAG, "WeatherEntity is null!");
                    }
                } else {
                    Log.e(TAG, "Response is not successful!");
                }
            }

            @Override
            public void onFailure(Call<WeatherEntity> call, Throwable t) {
                Log.e(TAG, "Response failed!");
                t.printStackTrace();
            }
        });
    }
}
