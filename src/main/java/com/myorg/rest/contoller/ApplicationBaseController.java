package com.myorg.rest.contoller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myorg.rest.beans.LoginCredentials;

@Component("ApplicationBaseController")
@RestController
public class ApplicationBaseController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public LoginCredentials greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new LoginCredentials(counter.incrementAndGet(), String.format(template, name));
	}
	
	@PostMapping(value = "/customers")
	public ResponseEntity<?> createCustomer(@RequestBody LoginCredentials loginCredentials) {
		System.out.println("POST request received");
		return new ResponseEntity<LoginCredentials>(loginCredentials, HttpStatus.OK);
	}
	
	@RequestMapping(value="/")
	public String hello() {
		return "hello";
	}
}
