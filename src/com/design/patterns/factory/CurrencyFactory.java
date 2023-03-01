package com.design.patterns.factory;
//Factory def : define an interface or abstract class for creating an object but
//let the subclasses decide which class to instantiate
public class CurrencyFactory {

	public static Currency getCurrencyByCountry(String cnty) throws Exception {

		if ("IN".equalsIgnoreCase(cnty)) {
			return new India();
		} else if ("USA".equalsIgnoreCase(cnty)) {
			return new USA();
		}else if ("BRL".equalsIgnoreCase(cnty)) {
			return new Brazil();
		}
		throw new Exception("Invalid country...");
	}

	public static void main(String[] args) {

		Currency india;
		try {
			india = CurrencyFactory.getCurrencyByCountry("IN");
			System.out.println("Indian currency: " + india.getCurrency());
			System.out.println("Indian currency symbol: " + india.getSymbol());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
