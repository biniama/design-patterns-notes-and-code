package com.biniam.designpatterns.adapter.foobarmotorco;

import com.biniam.foobarmotorco.domain.AbstractEngine;

/**
 * @author Biniam Asnake
 */
public class SuperGreenEngineAdapter extends AbstractEngine {

	SuperGreenEngine superGreenEngineToAdapt;

	public SuperGreenEngineAdapter(SuperGreenEngine superGreenEngineToAdapt) {
		// ADAPTION style 1
		super(superGreenEngineToAdapt.getEngineSize(), false /* not turbo charged */);
		this.superGreenEngineToAdapt = superGreenEngineToAdapt;
	}

	// ADAPTION style 2
	// override the getSize() method of the AbstractEngine and ADAPT it by calling the SuperGreenEngine's getEngine() method
	@Override
	public int getSize() {
		return superGreenEngineToAdapt.getEngineSize();
	}
}
