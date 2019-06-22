package com.revature.class_reads.hello;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

	private static AtomicLong counter = new AtomicLong();
	private long id;
	private String greeting;

	public Greeting() {
		super();
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static Greeting genericGreeting(String name) {
		Greeting genericGreeting = new Greeting();
		genericGreeting.setId(counter.getAndIncrement());
		genericGreeting.setGreeting("Hello " + name + "!");
		return genericGreeting;
	}

}
