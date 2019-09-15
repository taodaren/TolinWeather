package com.tolinweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class AQI {

    public AQICity city;

    public class AQICity {
        public String api;
        public String pm25;
        @SerializedName("qlty")
        public String airQuality;
    }
}