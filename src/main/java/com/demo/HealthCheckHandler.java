package com.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

/**
 * A handler which is used to perform health check.
 *
 * @author Niranjan Nanda
 */
@Component
public class HealthCheckHandler {

	/**
	 * Returns a 200 code as health check response
	 *
	 * @param request	The incoming http request
	 * @return	An empty response with 200 status.
	 */
	public Mono<ServerResponse> handle(final ServerRequest request) {
		return ServerResponse
				.ok()
				.build();
	}
}
