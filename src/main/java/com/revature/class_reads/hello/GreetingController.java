package com.revature.class_reads.hello;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class GreetingController {

	@GetMapping
	public Greeting getGreeting(@RequestParam("name") Optional<String> name) {
		return Greeting.genericGreeting(name.orElse("World"));
	}

}
