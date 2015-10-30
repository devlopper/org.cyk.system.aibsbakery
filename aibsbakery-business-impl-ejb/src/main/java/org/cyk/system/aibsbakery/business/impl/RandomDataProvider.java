package org.cyk.system.aibsbakery.business.impl;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.cyk.system.root.business.impl.AbstractRandomDataProvider;
import org.cyk.system.root.business.impl.RootRandomDataProvider;

@Singleton
public class RandomDataProvider extends AbstractRandomDataProvider implements Serializable {

	private static final long serialVersionUID = -4495079111239824662L;

	@Inject private RootRandomDataProvider rootRandomDataProvider;
	

}
