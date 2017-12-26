package com.developer35.serega.weatherwidget;


import com.developer35.serega.weatherwidget.entities.WeatherEntity;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherApi {

    @GET("34dcc0a117458b08/conditions/q/autoip.json")
    Call<WeatherEntity> getForecast();
}
