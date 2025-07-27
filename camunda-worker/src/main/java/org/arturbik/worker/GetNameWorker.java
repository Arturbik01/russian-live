package org.arturbik.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.Variable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GetNameWorker {

	@JobWorker(name = "getName")
	public void getName(@Variable(name = "chatId") String test){
		log.info("getName called");
	}
}
