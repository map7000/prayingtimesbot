package ru.mfilatov.prayingtimesbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandHandler {
    @Autowired
    TimesRegistry timesRegistry;

    public String handle(Long userId, String message) {
        return switch (message) {
            case "/status" -> timesRegistry.showStatus(userId);
            case "/users" -> timesRegistry.showUsers();
            case "/times" -> timesRegistry.getTimes(userId).toString();
            case "/help" ->
                    "/set_method to change calculation method" +
                    "/status to show your status\n" +
                    "/times to show Praying Times for your location" +
                    "You should send your location to get praying times";
            default -> "Unknown command";
        };
    }
}
