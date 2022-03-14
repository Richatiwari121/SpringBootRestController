package com.example.demo.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	
	//expose "/" that return hello rest controller
	
	@GetMapping("/")
	public String Msg() {
	 return 	"Welcome Spring Rest Controller"  +LocalDateTime.now();
	}
}
