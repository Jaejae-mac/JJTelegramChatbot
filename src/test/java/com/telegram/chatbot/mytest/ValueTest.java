package com.telegram.chatbot.mytest;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.telegram.chatbot.config.ApiKey;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ValueTest {
	@Autowired
	ApiKey apiKey;
	@Test
	public void testValue() {
		String token = apiKey.getToken();
		String botName = apiKey.getBotName();
		System.out.println(token);
		System.out.println(botName);
	}
}
