package com.my.company.menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MenuApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MenuApplication.class, args);
		context.getBean(MenuItemService.class).initMongoDB();
	}

}
