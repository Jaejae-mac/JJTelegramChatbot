package com.telegram.chatbot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class ApiKey {
	@Value("${telegram.token:@null}")
	private String token;
	@Value("${telegram.bot.name:@null}")
	private String botName;
	
	private static ApiKey instance = new ApiKey();
	private ApiKey() {}
	
	public static ApiKey getInstance() {
		if(instance == null){
			instance = new ApiKey();
		}
		return instance;
	}
}
