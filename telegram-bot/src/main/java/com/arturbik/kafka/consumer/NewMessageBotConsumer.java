package com.arturbik.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NewMessageBotConsumer {

	@KafkaListener(topics = "new_message_bot")
	public void consume(String message) {
		System.out.println("From consume" + message);
	}
}
