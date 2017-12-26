package com.developer35.serega.weatherwidget.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DisplayLocationEntity {

    @SerializedName("full")
    @Expose
    private String full;

    @SerializedName("city")
    @Expose
    private String city;

    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("state_name")
    @Expose
    private String stateName;

    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("country_iso3166")
    @Expose
    private String countryIso3166;

    @SerializedName("zip")
    @Expose
    private String zip;

    @SerializedName("magic")
    @Expose
    private String magic;

    @SerializedName("wmo")
    @Expose
    private String wmo;

    @SerializedName("latitude")
    @Expose
    private String latitude;

    @SerializedName("longitude")
    @Expose
    private String longitude;

    @SerializedName("elevation")
    @Expose
    private String elevation;

    public String getFull() {
        return full;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStateName() {
        return stateName;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryIso3166() {
        return countryIso3166;
    }

    public String getZip() {
        return zip;
    }

    public String getMagic() {
        return magic;
    }

    public String getWmo() {
        return wmo;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getElevation() {
        return elevation;
    }

    @Override
    public String toString() {
        return "DisplayLocationEntity{" +
                "full='" + full + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", stateName='" + stateName + '\'' +
                ", country='" + country + '\'' +
                ", countryIso3166='" + countryIso3166 + '\'' +
                ", zip='" + zip + '\'' +
                ", magic='" + magic + '\'' +
                ", wmo='" + wmo + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", elevation='" + elevation + '\'' +
                '}';
    }
}
