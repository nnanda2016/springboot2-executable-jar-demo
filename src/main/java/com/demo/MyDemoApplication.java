package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.Import;
import org.springframework.web.reactive.config.EnableWebFlux;

import reactor.core.publisher.Hooks;

/**
 * Spring application
 * 
 * @author Niranjan Nanda
 */
@SpringBootApplication
@EnableWebFlux
@Import(DemoAppConfig.class)
public class MyDemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(MyDemoApplication.class);
	
	public static void main(final String[] args) {
		 if (logger.isDebugEnabled()) {
				Hooks.onOperatorDebug();
	        }
	        
	        final SpringApplication sa = new SpringApplication(MyDemoApplication.class);
	        sa.addListeners(new ApplicationPidFileWriter());
	        sa.run(args);
	}
}
