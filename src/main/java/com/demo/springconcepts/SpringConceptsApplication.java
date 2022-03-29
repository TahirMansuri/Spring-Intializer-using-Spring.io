package com.demo.springconcepts;

import com.demo.springconcepts.component.DemoBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Sprint Boot Concept Demo");
		//SpringApplication.run(SpringConceptsApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("DemoBean = "+demoBean);
	}

}
