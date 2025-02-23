package com.bbva.wikj;
import com.bbva.wikj.dto.id.DtoOut;
import com.bbva.wikj.lib.r268.WIKJR268;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WIKJT26801MXTransaction extends AbstractWIKJT26801MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT26801MXTransaction.class);


	@Override
	public void execute() {
		WIKJR268 wikjr268 = this.getServiceLibrary(WIKJR268.class);
		DtoOut dtoOut = wikjr268.execute(this.getDtoin());
		this.setDtoOut(dtoOut);
	}

}
