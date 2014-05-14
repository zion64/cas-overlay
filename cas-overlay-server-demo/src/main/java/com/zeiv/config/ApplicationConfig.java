/**
 * 
 */
package com.zeiv.config;

import org.perf4j.log4j.aop.TimingAspect;

/**
 * @author anjongdeog
 *
 */
public class ApplicationConfig {

	/**
	 * 
	 */
	public ApplicationConfig() {
		// TODO Auto-generated constructor stub
	}

	public TimingAspect timingAspect() {
		return new TimingAspect();
	}
}
