package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoMailSendingApplication {

	@Autowired
	private EmailSenderService senderService;


	public static void main(String[] args) {
		SpringApplication.run(DemoMailSendingApplication.class, args);
	}
@EventListener(ApplicationReadyEvent.class)
	public  void sendMail(){
		senderService.sendEmail("mailofdineshmk@gmail.com","SpringBoot Project Testing subject","This mail sent for Testing Purpose only ThankYou....");
}
}
