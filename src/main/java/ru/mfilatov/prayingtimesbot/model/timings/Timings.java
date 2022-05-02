package ru.mfilatov.prayingtimesbot.model.timings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Timings {
    @JsonProperty("Fajr")
    public String fajr;
    @JsonProperty("Sunrise")
    public String sunrise;
    @JsonProperty("Dhuhr")
    public String dhuhr;
    @JsonProperty("Asr")
    public String asr;
    @JsonProperty("Sunset")
    public String sunset;
    @JsonProperty("Maghrib")
    public String maghrib;
    @JsonProperty("Isha")
    public String isha;
    @JsonProperty("Imsak")
    public String imsak;
    @JsonProperty("Midnight")
    public String midnight;

    @Override
    public String toString() {
        return "Fajr: " + fajr +
                "\nSunrise: " + sunrise +
                "\nDhuhr: " + dhuhr +
                "\nAsr: " + asr +
                "\nSunset: " + sunset +
                "\nMaghrib: " + maghrib +
                "\nIsha: " + isha +
                "\nImsak: " + imsak +
                "\nMidnight: " + midnight;
    }
}

