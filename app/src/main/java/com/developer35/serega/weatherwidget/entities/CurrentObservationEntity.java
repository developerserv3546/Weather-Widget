package com.developer35.serega.weatherwidget.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentObservationEntity {

    @SerializedName("image")
    @Expose
    private ImageEntity imageEntity;

    @SerializedName("display_location")
    @Expose
    private DisplayLocationEntity displayLocationEntity;

    @SerializedName("observation_location")
    @Expose
    private ObservationLocationEntity observationLocationEntity;

    @SerializedName("estimated")
    @Expose
    private EstimatedEntity estimatedEntity;

    @SerializedName("station_id")
    @Expose
    private String stationId;

    @SerializedName("observation_time")
    @Expose
    private String observationTime;

    @SerializedName("observation_time_rfc822")
    @Expose
    private String observationTimeRfc822;

    @SerializedName("observation_epoch")
    @Expose
    private String observationEpoch;

    @SerializedName("local_time_rfc822")
    @Expose
    private String localTimeRfc822;

    @SerializedName("local_epoch")
    @Expose
    private String localEpoch;

    @SerializedName("local_tz_short")
    @Expose
    private String localTzShort;

    @SerializedName("local_tz_long")
    @Expose
    private String localTzLong;

    @SerializedName("local_tz_offset")
    @Expose
    private String localTzOffset;

    @SerializedName("weather")
    @Expose
    private String weather;

    @SerializedName("temperature_string")
    @Expose
    private String temperatureString;

    @SerializedName("temp_f")
    @Expose
    private Double tempF;

    @SerializedName("temp_c")
    @Expose
    private Double tempC;

    @SerializedName("relative_humidity")
    @Expose
    private String relativeHumidity;

    @SerializedName("wind_string")
    @Expose
    private String windString;

    @SerializedName("wind_dir")
    @Expose
    private String windDir;

    @SerializedName("wind_degrees")
    @Expose
    private Integer windDegrees;

    @SerializedName("wind_mph")
    @Expose
    private Double windMph;

    @SerializedName("wind_gust_mph")
    @Expose
    private String windGustMph;

    @SerializedName("wind_kph")
    @Expose
    private Double windKph;

    @SerializedName("wind_gust_kph")
    @Expose
    private String windGustKph;

    @SerializedName("pressure_mb")
    @Expose
    private String pressureMb;

    @SerializedName("pressure_in")
    @Expose
    private String pressureIn;

    @SerializedName("pressure_trend")
    @Expose
    private String pressureTrend;

    @SerializedName("dewpoint_string")
    @Expose
    private String dewpointString;

    @SerializedName("dewpoint_f")
    @Expose
    private Integer dewpointF;

    @SerializedName("dewpoint_c")
    @Expose
    private Integer dewpointC;

    @SerializedName("heat_index_string")
    @Expose
    private String heatIndexString;

    @SerializedName("heat_index_f")
    @Expose
    private String heatIndexF;

    @SerializedName("heat_index_c")
    @Expose
    private String heatIndexC;

    @SerializedName("windchill_string")
    @Expose
    private String windchillString;

    @SerializedName("windchill_f")
    @Expose
    private String windchillF;

    @SerializedName("windchill_c")
    @Expose
    private String windchillC;

    @SerializedName("feelslike_string")
    @Expose
    private String feelslikeString;

    @SerializedName("feelslike_f")
    @Expose
    private String feelslikeF;

    @SerializedName("feelslike_c")
    @Expose
    private String feelslikeC;

    @SerializedName("visibility_mi")
    @Expose
    private String visibilityMi;

    @SerializedName("visibility_km")
    @Expose
    private String visibilityKm;

    @SerializedName("solarradiation")
    @Expose
    private String solarradiation;

    @SerializedName("UV")
    @Expose
    private String uV;

    @SerializedName("precip_1hr_string")
    @Expose
    private String precip1hrString;

    @SerializedName("precip_1hr_in")
    @Expose
    private String precip1hrIn;

    @SerializedName("precip_1hr_metric")
    @Expose
    private String precip1hrMetric;

    @SerializedName("precip_today_string")
    @Expose
    private String precipTodayString;

    @SerializedName("precip_today_in")
    @Expose
    private String precipTodayIn;

    @SerializedName("precip_today_metric")
    @Expose
    private String precipTodayMetric;

    @SerializedName("icon")
    @Expose
    private String icon;

    @SerializedName("icon_url")
    @Expose
    private String iconUrl;

    @SerializedName("forecast_url")
    @Expose
    private String forecastUrl;

    @SerializedName("history_url")
    @Expose
    private String historyUrl;

    @SerializedName("ob_url")
    @Expose
    private String obUrl;

    @SerializedName("nowcast")
    @Expose
    private String nowcast;

    public ImageEntity getImageEntity() {
        return imageEntity;
    }

    public DisplayLocationEntity getDisplayLocationEntity() {
        return displayLocationEntity;
    }

    public ObservationLocationEntity getObservationLocationEntity() {
        return observationLocationEntity;
    }

    public EstimatedEntity getEstimatedEntity() {
        return estimatedEntity;
    }

    public String getStationId() {
        return stationId;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public String getObservationTimeRfc822() {
        return observationTimeRfc822;
    }

    public String getObservationEpoch() {
        return observationEpoch;
    }

    public String getLocalTimeRfc822() {
        return localTimeRfc822;
    }

    public String getLocalEpoch() {
        return localEpoch;
    }

    public String getLocalTzShort() {
        return localTzShort;
    }

    public String getLocalTzLong() {
        return localTzLong;
    }

    public String getLocalTzOffset() {
        return localTzOffset;
    }

    public String getWeather() {
        return weather;
    }

    public String getTemperatureString() {
        return temperatureString;
    }

    public Double getTempF() {
        return tempF;
    }

    public Double getTempC() {
        return tempC;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public String getWindString() {
        return windString;
    }

    public String getWindDir() {
        return windDir;
    }

    public Integer getWindDegrees() {
        return windDegrees;
    }

    public Double getWindMph() {
        return windMph;
    }

    public String getWindGustMph() {
        return windGustMph;
    }

    public Double getWindKph() {
        return windKph;
    }

    public String getWindGustKph() {
        return windGustKph;
    }

    public String getPressureMb() {
        return pressureMb;
    }

    public String getPressureIn() {
        return pressureIn;
    }

    public String getPressureTrend() {
        return pressureTrend;
    }

    public String getDewpointString() {
        return dewpointString;
    }

    public Integer getDewpointF() {
        return dewpointF;
    }

    public Integer getDewpointC() {
        return dewpointC;
    }

    public String getHeatIndexString() {
        return heatIndexString;
    }

    public String getHeatIndexF() {
        return heatIndexF;
    }

    public String getHeatIndexC() {
        return heatIndexC;
    }

    public String getWindchillString() {
        return windchillString;
    }

    public String getWindchillF() {
        return windchillF;
    }

    public String getWindchillC() {
        return windchillC;
    }

    public String getFeelslikeString() {
        return feelslikeString;
    }

    public String getFeelslikeF() {
        return feelslikeF;
    }

    public String getFeelslikeC() {
        return feelslikeC;
    }

    public String getVisibilityMi() {
        return visibilityMi;
    }

    public String getVisibilityKm() {
        return visibilityKm;
    }

    public String getSolarradiation() {
        return solarradiation;
    }

    public String getuV() {
        return uV;
    }

    public String getPrecip1hrString() {
        return precip1hrString;
    }

    public String getPrecip1hrIn() {
        return precip1hrIn;
    }

    public String getPrecip1hrMetric() {
        return precip1hrMetric;
    }

    public String getPrecipTodayString() {
        return precipTodayString;
    }

    public String getPrecipTodayIn() {
        return precipTodayIn;
    }

    public String getPrecipTodayMetric() {
        return precipTodayMetric;
    }

    public String getIcon() {
        return icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getForecastUrl() {
        return forecastUrl;
    }

    public String getHistoryUrl() {
        return historyUrl;
    }

    public String getObUrl() {
        return obUrl;
    }

    public String getNowcast() {
        return nowcast;
    }

    @Override
    public String toString() {
        return "CurrentObservationEntity{" +
                "imageEntity=" + imageEntity +
                ", displayLocationEntity=" + displayLocationEntity +
                ", observationLocationEntity=" + observationLocationEntity +
                ", estimatedEntity=" + estimatedEntity +
                ", stationId='" + stationId + '\'' +
                ", observationTime='" + observationTime + '\'' +
                ", observationTimeRfc822='" + observationTimeRfc822 + '\'' +
                ", observationEpoch='" + observationEpoch + '\'' +
                ", localTimeRfc822='" + localTimeRfc822 + '\'' +
                ", localEpoch='" + localEpoch + '\'' +
                ", localTzShort='" + localTzShort + '\'' +
                ", localTzLong='" + localTzLong + '\'' +
                ", localTzOffset='" + localTzOffset + '\'' +
                ", weather='" + weather + '\'' +
                ", temperatureString='" + temperatureString + '\'' +
                ", tempF=" + tempF +
                ", tempC=" + tempC +
                ", relativeHumidity='" + relativeHumidity + '\'' +
                ", windString='" + windString + '\'' +
                ", windDir='" + windDir + '\'' +
                ", windDegrees=" + windDegrees +
                ", windMph=" + windMph +
                ", windGustMph='" + windGustMph + '\'' +
                ", windKph=" + windKph +
                ", windGustKph='" + windGustKph + '\'' +
                ", pressureMb='" + pressureMb + '\'' +
                ", pressureIn='" + pressureIn + '\'' +
                ", pressureTrend='" + pressureTrend + '\'' +
                ", dewpointString='" + dewpointString + '\'' +
                ", dewpointF=" + dewpointF +
                ", dewpointC=" + dewpointC +
                ", heatIndexString='" + heatIndexString + '\'' +
                ", heatIndexF='" + heatIndexF + '\'' +
                ", heatIndexC='" + heatIndexC + '\'' +
                ", windchillString='" + windchillString + '\'' +
                ", windchillF='" + windchillF + '\'' +
                ", windchillC='" + windchillC + '\'' +
                ", feelslikeString='" + feelslikeString + '\'' +
                ", feelslikeF='" + feelslikeF + '\'' +
                ", feelslikeC='" + feelslikeC + '\'' +
                ", visibilityMi='" + visibilityMi + '\'' +
                ", visibilityKm='" + visibilityKm + '\'' +
                ", solarradiation='" + solarradiation + '\'' +
                ", uV='" + uV + '\'' +
                ", precip1hrString='" + precip1hrString + '\'' +
                ", precip1hrIn='" + precip1hrIn + '\'' +
                ", precip1hrMetric='" + precip1hrMetric + '\'' +
                ", precipTodayString='" + precipTodayString + '\'' +
                ", precipTodayIn='" + precipTodayIn + '\'' +
                ", precipTodayMetric='" + precipTodayMetric + '\'' +
                ", icon='" + icon + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", forecastUrl='" + forecastUrl + '\'' +
                ", historyUrl='" + historyUrl + '\'' +
                ", obUrl='" + obUrl + '\'' +
                ", nowcast='" + nowcast + '\'' +
                '}';
    }
}
