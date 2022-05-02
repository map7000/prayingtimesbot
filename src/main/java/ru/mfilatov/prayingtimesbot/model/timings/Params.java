package ru.mfilatov.prayingtimesbot.model.timings;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Params {
    @JsonProperty("Fajr")
    public double fajr;
    @JsonProperty("Isha")
    public String isha;
}
