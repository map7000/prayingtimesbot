package ru.mfilatov.prayingtimesbot;

import org.springframework.stereotype.Component;
import ru.mfilatov.prayingtimesbot.model.User;

import java.util.*;

@Component
public class TimesRegistry {
    private final static Double MOSCOW_LATITUDE = 55.75222;
    private final static Double MOSCOW_LONGTITUDE = 37.61556;
    private final static Integer MOSCOW_METHOD = 14;

    private HashMap<Long, User> users = new HashMap<>();

    public String addUser(Long userId) {
        if (users.containsKey(userId)) return "User already added";
        users.put(userId, new User(MOSCOW_LATITUDE, MOSCOW_LONGTITUDE, MOSCOW_METHOD, true));
        return "User added";
    }

    public String showStatus(Long userId) {
        return users.containsKey(userId) ? "Subscribed" : "Not subscribed";
    }

    public String showUsers() {
        StringBuilder stringBuilder = new StringBuilder();
        users.keySet().forEach(a -> stringBuilder.append(a + " : " + users.get(a) + "\n"));
        return stringBuilder.toString();
    }

    public String updateUserLocation(Long userId, Double latitude, Double longtitude) {
        if (!users.containsKey(userId))
            addUser(userId);

        User user = users.get(userId);

        if(user.getLatitude() == latitude && user.getLongitude() == longtitude)
                return "This location already set";

        user.setLatitude(latitude);
        user.setLongitude(longtitude);
        user.setNeedUpdate(true);

        return "Successfully set new Location";
    }
}
