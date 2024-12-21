package com.design.patterns.singleton;

public class SingletonClass {

	private static volatile SingletonClass singletonObject = null;

	private SingletonClass() {
		System.out.println("singleton Object object created");
	}

	public static SingletonClass getInstance() {

		if (singletonObject == null) {
			synchronized (SingletonClass.class) {
				if(singletonObject == null)
				singletonObject = new SingletonClass();
			}

		}

		return singletonObject;
	}

	public static void useMethod() {
		SingletonClass s = SingletonClass.getInstance();
		System.out.println("hashcode : " + s.hashCode());
	}

}
