package com.developer35.serega.weatherwidget;


import com.developer35.serega.weatherwidget.entities.WeatherEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherApi {

    @GET("{key}/conditions/q/autoip.json")
    Call<WeatherEntity> getForecast(@Path("key") String key);
}