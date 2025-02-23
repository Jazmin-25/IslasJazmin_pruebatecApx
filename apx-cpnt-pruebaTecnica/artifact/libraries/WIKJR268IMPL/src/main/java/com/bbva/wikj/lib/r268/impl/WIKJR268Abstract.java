package com.bbva.wikj.lib.r268.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.wikj.lib.r268.WIKJR268;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class WIKJR268Abstract extends AbstractLibrary implements WIKJR268 {

	protected ApplicationConfigurationService applicationConfigurationService;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

}