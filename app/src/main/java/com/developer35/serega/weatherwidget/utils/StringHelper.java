package com.developer35.serega.weatherwidget.utils;


import android.content.Context;

import com.developer35.serega.weatherwidget.R;
import com.developer35.serega.weatherwidget.entities.WeatherEntity;

import java.util.Calendar;
import java.util.TimeZone;

public class StringHelper {

    private static final String FAHRENHEIT = " F";

    public static String getDayOfMonth() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        return String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
    }

    public static String getMonth(Context context) {

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int month = calendar.get(Calendar.MONTH);

        switch (month) {
            case Calendar.JANUARY:
                return context.getString(R.string.january);
            case Calendar.FEBRUARY:
                return context.getString(R.string.february);
            case Calendar.MARCH:
                return context.getString(R.string.march);
            case Calendar.APRIL:
                return context.getString(R.string.april);
            case Calendar.MAY:
                return context.getString(R.string.may);
            case Calendar.JUNE:
                return context.getString(R.string.june);
            case Calendar.JULY:
                return context.getString(R.string.july);
            case Calendar.AUGUST:
                return context.getString(R.string.august);
            case Calendar.SEPTEMBER:
                return context.getString(R.string.september);
            case Calendar.OCTOBER:
                return context.getString(R.string.october);
            case Calendar.NOVEMBER:
                return context.getString(R.string.november);
            case Calendar.DECEMBER:
                return context.getString(R.string.december);
            default:
                return context.getString(R.string.undefined);
        }
    }

    public static String getTemperature(WeatherEntity entity) {
        return String.valueOf(entity.getCurrentObservationEntity()
                .getTempF()) + FAHRENHEIT;
    }

    public static String getLocation(WeatherEntity entity) {
        return entity.getCurrentObservationEntity()
                .getDisplayLocationEntity()
                .getFull();
    }
}
