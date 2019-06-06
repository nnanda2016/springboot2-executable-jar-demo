package com.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Config properties
 * 
 * @author Niranjan Nanda
 */
@ConfigurationProperties("app")
public class DemoAppConfigProperties {
	private String config1;
	private int config2;
	/**
	 * Returns the value of config1.
	 *
	 * @return the config1
	 */
	public String getConfig1() {
		return config1;
	}
	/**
	 * Sets the value of config1.
	 *
	 * @param config1 the config1 to set
	 */
	public void setConfig1(final String config1) {
		this.config1 = config1;
	}
	/**
	 * Returns the value of config2.
	 *
	 * @return the config2
	 */
	public int getConfig2() {
		return config2;
	}
	/**
	 * Sets the value of config2.
	 *
	 * @param config2 the config2 to set
	 */
	public void setConfig2(final int config2) {
		this.config2 = config2;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("DemoAppConfigProperties {config1=");
		builder.append(config1);
		builder.append(", config2=");
		builder.append(config2);
		builder.append("}");
		return builder.toString();
	}
	
}
