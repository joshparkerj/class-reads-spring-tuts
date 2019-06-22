package com.revature.class_reads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.class_reads.knights.Knight;

/**
 * Starter class for this project
 *
 */

@SpringBootApplication
public class App {

	private ApplicationContext context;

	public App() {
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}

	public static void main(String[] args) {
		Knight knightM = (Knight) new App().context.getBean("m-knight");
		knightM.embarkOnQuest();
		Knight knightB = (Knight) new App().context.getBean("b-knight");
		knightB.embarkOnQuest();
		SpringApplication.run(App.class, args);
	}

}
