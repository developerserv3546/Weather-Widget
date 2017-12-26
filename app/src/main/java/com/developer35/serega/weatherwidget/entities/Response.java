package com.developer35.serega.weatherwidget.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("version")
    @Expose
    private String version;

    @SerializedName("termsofService")
    @Expose
    private String termsofService;

    @SerializedName("features")
    @Expose
    private Features features;

    public String getVersion() {
        return version;
    }

    public String getTermsofService() {
        return termsofService;
    }

    public Features getFeatures() {
        return features;
    }

    @Override
    public String toString() {
        return "Response{" +
                "version='" + version + '\'' +
                ", termsofService='" + termsofService + '\'' +
                ", features=" + features +
                '}';
    }
}
