package com.example.oauth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstOAuthController {

	@GetMapping
	public String getMessage(Principal principal) {
		return "Hello " + principal.getName() + "! Welcome to my oAuth Example";
	}
}
