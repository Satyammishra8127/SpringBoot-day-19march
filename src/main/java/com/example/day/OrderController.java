package com.example.day;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrderController {// Singleton
   
	@PostMapping("/order")
	void createOrder() {
		System.out.println("created");
	}
}
