package com.design.patterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonMainClass {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(5);
		service.execute(SingletonClass::useMethod);
		service.execute(SingletonClass::useMethod);
		service.execute(SingletonClass::useMethod);
		service.execute(SingletonClass::useMethod);
		service.execute(SingletonClass::useMethod);
		service.shutdown();
	}

}
