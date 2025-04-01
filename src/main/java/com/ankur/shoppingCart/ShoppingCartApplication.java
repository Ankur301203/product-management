package com.ankur.shoppingCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ShoppingCartApplication.class, args);



	}

}
