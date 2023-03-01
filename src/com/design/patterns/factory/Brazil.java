package com.design.patterns.factory;

public class Brazil implements Currency{

	@Override
	public String getCurrency() {
		return "Brazilian real";
	}

	@Override
	public String getSymbol() {
		return "R$";
	}

}
