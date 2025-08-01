package org.arturbik.produces;

import io.camunda.zeebe.client.ZeebeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaStartProcessBpmn implements CommandLineRunner {

	private final ZeebeClient zeebeClient;

	@KafkaListener(topics = "new_message_bot", groupId = "camunda-processor")
	@Override
	public void run(String... args) throws Exception {
		zeebeClient.newCreateInstanceCommand().bpmnProcessId("registration").latestVersion().variable("chatId", 111).send().join();
	}
}
