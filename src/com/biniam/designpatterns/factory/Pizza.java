package com.biniam.designpatterns.factory;

/**
 * @author Biniam Asnake
 */
public interface Pizza {

	void prepare();

	void bake();

	void cut();

	void box();

	String getName();
}
