package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;
import org.springframework.stereotype.Component;

/**
 * Demo {@link FailureAnalyzer}
 * 
 * @author Niranjan Nanda
 */
@Component
public class CustomFailureAnalyzer implements FailureAnalyzer {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomFailureAnalyzer.class);
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public FailureAnalysis analyze(final Throwable failure) {
		logger.error("Root cause: ", failure);
		return new FailureAnalysis("Sample description", "Sample action", failure);
	}
	
}
