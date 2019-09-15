package com.tolinweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("brf")
        public String feel;

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("brf")
        public String feel;

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("brf")
        public String feel;

        @SerializedName("txt")
        public String info;

    }

}
