package ru.mfilatov.prayingtimesbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocationHandler {
    @Autowired
    TimesRegistry timesRegistry;

    public String handle(Long userId, Double latitude, Double longtitude) {
        return timesRegistry.updateUserLocation(userId, latitude, longtitude);
    }
}
