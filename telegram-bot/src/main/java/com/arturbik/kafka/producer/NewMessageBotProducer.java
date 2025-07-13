package com.arturbik.kafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
@RequiredArgsConstructor
public class NewMessageBotProducer{
	private final KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(Message message){
		kafkaTemplate.send("new_message_bot", message.toString());
	}
}
