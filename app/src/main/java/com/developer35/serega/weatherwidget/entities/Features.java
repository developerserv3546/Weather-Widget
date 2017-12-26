package com.developer35.serega.weatherwidget.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Features {

    @SerializedName("conditions")
    @Expose
    private Integer conditions;

    public Integer getConditions() {
        return conditions;
    }

    @Override
    public String toString() {
        return "Features{" +
                "conditions=" + conditions +
                '}';
    }
}
