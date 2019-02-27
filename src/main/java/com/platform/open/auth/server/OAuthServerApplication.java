package com.platform.open.auth.server;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableResourceServer
public class OAuthServerApplication {

	@GetMapping("/user")
	public Principal getUserInfo(Principal principal) {
		return principal;
	}

	public static void main(String[] args) {
		SpringApplication.run(OAuthServerApplication.class, args);
	}

}
