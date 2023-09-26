package com.porj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SmtpAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmtpAdminServerApplication.class, args);
	}

}
