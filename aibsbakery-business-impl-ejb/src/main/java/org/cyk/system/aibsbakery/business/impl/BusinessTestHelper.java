package org.cyk.system.aibsbakery.business.impl;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.system.root.business.impl.AbstractTestHelper;

@Singleton
public class BusinessTestHelper extends AbstractTestHelper implements Serializable {

	private static final long serialVersionUID = -6893154890151909538L;
	private static BusinessTestHelper INSTANCE;
	
	/**/
	
	@Override
	protected void initialisation() {
		INSTANCE = this;
		super.initialisation();
	}

	public static BusinessTestHelper getInstance() {
		return INSTANCE;
	}

}
