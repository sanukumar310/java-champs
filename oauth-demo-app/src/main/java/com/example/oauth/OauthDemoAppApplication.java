package com.example.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class OauthDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthDemoAppApplication.class, args);
	}
}
