package com.nagp;

import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Demo extends SpringBootServletInitializer {

    private static final Logger LOG = LogManager.getLogger(Demo.class);

    public static void main(String[] args) {

	LOG.info("");

	SpringApplication app = new SpringApplication(Demo.class);
	app.setDefaultProperties(Collections.singletonMap("server.port", "8084"));
	app.run(args);

    }

}
	