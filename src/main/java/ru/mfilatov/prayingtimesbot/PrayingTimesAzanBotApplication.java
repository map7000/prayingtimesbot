package ru.mfilatov.prayingtimesbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PrayingTimesAzanBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrayingTimesAzanBotApplication.class, args);
	}
}
