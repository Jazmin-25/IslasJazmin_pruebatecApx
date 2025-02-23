package com.bbva.wikj.lib.r268.impl;
import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.wikj.dto.id.DtoIn;
import com.bbva.wikj.dto.id.DtoOut;
import com.bbva.wikj.lib.r268.WIKJR268;
import com.bbva.wikj.lib.r269.WIKJR269;


public abstract class WIKJR268Abstract extends AbstractLibrary implements WIKJR268 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected WIKJR269 wikjR269;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

	/**
	* @param wikjR269 the this.wikjR269 to set
	*/
	public void setWikjR269(WIKJR269 wikjR269) {
		this.wikjR269 = wikjR269;
	}

	public abstract DtoOut execute(DtoIn dtoIn);
}