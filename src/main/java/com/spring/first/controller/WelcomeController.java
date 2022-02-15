package com.spring.first.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name, @RequestParam("name") String pathName) {
		return "Welcome Home, "+ name  + " and "  + pathName;
	}
}
