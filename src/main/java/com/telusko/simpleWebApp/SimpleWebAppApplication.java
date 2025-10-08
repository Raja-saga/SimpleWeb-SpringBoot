package com.telusko.simpleWebApp;

import com.telusko.simpleWebApp.controller.ProductController;
import com.telusko.simpleWebApp.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleWebAppApplication {

	public static void main(String[] args) {

		 SpringApplication.run(SimpleWebAppApplication.class, args);

	}

}
