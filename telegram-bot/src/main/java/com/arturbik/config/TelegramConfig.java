package com.arturbik.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.List;

@Configuration
public class TelegramConfig {

//	@Bean
//	public TelegramBotsApi telegramBotsApi() throws TelegramApiException {
//		return new TelegramBotsApi(DefaultBotSession.class);
//	}

	// Регистрация всех ботов, которые являются наследниками TelegramLongPollingBot
//	@Bean
//	public ApplicationRunner botRegistrationRunner(
//			TelegramBotsApi telegramBotsApi,
//			List<TelegramLongPollingBot> bots
//	) {
//		return args -> {
//			for (TelegramLongPollingBot bot : bots) {
//				telegramBotsApi.registerBot(bot);
//				System.out.println("Зарегистрирован бот: " + bot.getBotUsername());
//			}
//		};
//	}
}