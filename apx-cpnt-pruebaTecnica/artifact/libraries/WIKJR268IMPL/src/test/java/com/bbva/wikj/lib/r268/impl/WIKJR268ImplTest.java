package com.bbva.wikj.lib.r268.impl;

import com.bbva.elara.domain.transaction.Context;
import com.bbva.elara.domain.transaction.ThreadContext;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WIKJR268ImplTest {


	/* There are methods of the APX Architecture that require greater complexity to mock, for this reason
	 * an instance of the class to be tested can be created with the overwritten methods and on these
	 * methods the mocking of the classes is carried out, for example Header data 
	 * (The Mocking the header is only for libraries that are used online, in batch it would not work)
	 * 
	 * Import section:
	 * - import com.bbva.elara.domain.transaction.RequestHeaderParamsName;
	 * - import com.bbva.elara.domain.transaction.request.header.CommonRequestHeader;
	 * 
	 * Instance section:
	 * 	@Mock
	 *  private CommonRequestHeader commonRequestHeader;
	 *
	 *  @InjectMocks
	 *  private WIKJR268Impl wikjR268 = new WIKJR268Impl() {
	 *  	@Override
	 *  	protected CommonRequestHeader getRequestHeader() {
	 *  		return commonRequestHeader;
	 *  	}
	 *  };
	 */
	@InjectMocks
	private WIKJR268Impl wikjR268;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		ThreadContext.set(new Context());
	}

	@Test
	public void executeTest(){
		// when(commonRequestHeader.getHeaderParameter(RequestHeaderParamsName.COUNTRYCODE)).thenReturn("ES");
		// when(applicationConfigurationService.getProperty("config.property")).thenReturn("value");
		// when(qwaiR001.execute()).thenReturn(listCustomerDTO);
		wikjR268.execute();
		Assert.assertEquals(0, wikjR268.getAdviceList().size());
	}
}
