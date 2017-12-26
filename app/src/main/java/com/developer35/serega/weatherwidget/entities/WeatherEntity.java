package com.developer35.serega.weatherwidget.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherEntity {

    @SerializedName("response")
    @Expose
    private ResponseEntity responseEntity;

    @SerializedName("current_observation")
    @Expose
    private CurrentObservationEntity currentObservationEntity;

    public ResponseEntity getResponseEntity() {
        return responseEntity;
    }

    public CurrentObservationEntity getCurrentObservationEntity() {
        return currentObservationEntity;
    }

    @Override
    public String toString() {
        return "WeatherEntity{" +
                "responseEntity=" + responseEntity +
                ", currentObservationEntity=" + currentObservationEntity +
                '}';
    }
}
