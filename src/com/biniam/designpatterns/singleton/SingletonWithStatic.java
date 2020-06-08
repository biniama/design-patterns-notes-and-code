package com.biniam.designpatterns.singleton;

/**
 * Source: https://www.baeldung.com/java-static
 * Example of static Class
 * 		The most widely used approach to create singleton objects is through static nested class is it doesn't require any synchronization and is easy to
 * 		learn and implement:
 * @author Biniam Asnake
 */
public class SingletonWithStatic {

	private SingletonWithStatic() {}

	private static class SingletonHolder {
		public static final SingletonWithStatic instance = new SingletonWithStatic();
	}

	public static SingletonWithStatic getInstance() {
		return SingletonHolder.instance;
	}
}
