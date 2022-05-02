package ru.mfilatov.prayingtimesbot;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@Slf4j
public class PraingTimesBot extends TelegramLongPollingBot {
    @Autowired
    CommandHandler commandHandler;

    @Autowired
    LocationHandler locationHandler;

    @Value("${telegram.bot.key}")
    String botKey;

    @Value("${telegram.bot.name}")
    String botName;

    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botKey;
    }

    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().isCommand()) {
            log.info("{}: {}", update.getMessage().getChatId(), update.getMessage().getText());
            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(commandHandler.handle(update.getMessage().getChatId(), update.getMessage().getText()));
            execute(message);
        } else if (update.hasMessage() && update.getMessage().hasLocation()) {
            log.info("Set location for user {} to {} {}", update.getMessage().getChatId(),
                    update.getMessage().getLocation().getLatitude(),
                    update.getMessage().getLocation().getLongitude());

            String response = locationHandler.handle(update.getMessage().getChatId(),
                    update.getMessage().getLocation().getLatitude(),
                    update.getMessage().getLocation().getLongitude());

            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(response);
            execute(message);
        }
    }
}
