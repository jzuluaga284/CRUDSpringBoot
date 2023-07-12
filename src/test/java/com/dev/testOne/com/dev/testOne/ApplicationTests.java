package com.dev.testOne.com.dev.testOne;

import com.dev.testOne.com.dev.testOne.controllers.HelloWorldController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private HelloWorldController helloWorldController;
	@Test
	void helloWorldControllerTest() {

		Assertions.assertEquals(HttpStatus.OK,helloWorldController.test());
	}

}
