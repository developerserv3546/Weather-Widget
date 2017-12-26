package com.developer35.serega.weatherwidget.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeaturesEntity {

    @SerializedName("conditions")
    @Expose
    private Integer conditions;

    public Integer getConditions() {
        return conditions;
    }

    @Override
    public String toString() {
        return "FeaturesEntity{" +
                "conditions=" + conditions +
                '}';
    }
}
