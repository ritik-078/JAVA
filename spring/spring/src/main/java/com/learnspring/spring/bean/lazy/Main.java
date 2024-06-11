package com.learnspring.spring.bean.lazy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		var context = SpringApplication.run(Main.class, args);

		LazyLoader lazyLoader = context.getBean(LazyLoader.class);
	}

}
