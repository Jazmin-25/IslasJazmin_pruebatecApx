package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.id.DtoIn;
import com.bbva.wikj.dto.id.DtoOut;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractWIKJT26801MXTransaction extends AbstractTransaction {

	public AbstractWIKJT26801MXTransaction(){
	}


	/**
	 * Return value for input parameter dtoIn
	 */
	protected DtoIn getDtoin(){
		return (DtoIn)this.getParameter("dtoIn");
	}

	/**
	 * Set value for DtoOut output parameter dtoOut
	 */
	protected void setDtoOut(final DtoOut field){
		this.addParameter("dtoOut", field);
	}
}
