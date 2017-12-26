package com.developer35.serega.weatherwidget.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseEntity {

    @SerializedName("version")
    @Expose
    private String version;

    @SerializedName("termsofService")
    @Expose
    private String termsofService;

    @SerializedName("features")
    @Expose
    private FeaturesEntity featuresEntity;

    public String getVersion() {
        return version;
    }

    public String getTermsofService() {
        return termsofService;
    }

    public FeaturesEntity getFeaturesEntity() {
        return featuresEntity;
    }

    @Override
    public String toString() {
        return "ResponseEntity{" +
                "version='" + version + '\'' +
                ", termsofService='" + termsofService + '\'' +
                ", featuresEntity=" + featuresEntity +
                '}';
    }
}
