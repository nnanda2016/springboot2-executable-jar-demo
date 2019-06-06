package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Spring app config
 * 
 * @author Niranjan Nanda
 */
@Configuration
@EnableConfigurationProperties({DemoAppConfigProperties.class})
public class DemoAppConfig {
	private static final Logger logger = LoggerFactory.getLogger(DemoAppConfig.class);
	
	@Autowired
	private HealthCheckHandler healthCheckHandler;
	
	@Autowired
	private DemoAppConfigProperties props;
	
	@Bean
	public String someDemoBean() {
		logger.info("DemoAppConfigProperties ==> {}", props);
		
		if (props.getConfig2() <= 10) {
			throw new RuntimeException("config2 value must be bigger than 10");
		}
		
		return new StringBuilder()
			.append(props.getConfig1())
			.append("-")
			.append(props.getConfig2())
			.toString();
	}
	
	@Bean(name = "routesConfig")
	public RouterFunction<ServerResponse> routes() {
		return RouterFunctions
				.route(RequestPredicates.GET("/health/check"), healthCheckHandler::handle) // Route to handle health check
				;
	}
}
