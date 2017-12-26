package com.developer35.serega.weatherwidget.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("response")
    @Expose
    private Response response;

    @SerializedName("current_observation")
    @Expose
    private CurrentObservation currentObservation;

    public Response getResponse() {
        return response;
    }

    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }

    @Override
    public String toString() {
        return "Example{" +
                "response=" + response +
                ", currentObservation=" + currentObservation +
                '}';
    }
}
