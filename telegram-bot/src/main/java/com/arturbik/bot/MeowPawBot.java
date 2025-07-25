package com.arturbik.bot;

import com.arturbik.kafka.producer.NewMessageBotProducer;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component
public class MeowPawBot extends TelegramLongPollingBot {

	private final String username;
	private final NewMessageBotProducer newMessageBotProducer;

	@SneakyThrows
	public MeowPawBot(
			@Value("${TG_TOKEN}") String token,
			@Value("${bot.username}") String username,
			NewMessageBotProducer newMessageBotProducer
	) {
		super(new DefaultBotOptions(), token);
		this.username = username;

		this.newMessageBotProducer = newMessageBotProducer;

		new TelegramBotsApi(DefaultBotSession.class).registerBot(this);
	}


	@Override
	public void onUpdateReceived(Update update) {
		if (update.hasMessage() && update.getMessage().hasText()) {
			String messageText = update.getMessage().getText();
			newMessageBotProducer.sendMessage(update.getMessage());
		}
	}

	@Override
	public String getBotUsername() {
		return username;
	}

}
