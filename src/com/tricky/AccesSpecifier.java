package com.tricky;

public abstract class AccesSpecifier {
	private void fly() {
		System.out.println("Bird is flying"); 
		}
	public static void main(String[] args) {
		
		AccesSpecifier bird = new Pelican();

		bird.fly();
	}

}


class Pelican extends AccesSpecifier {

protected void fly() { 
	System.out.println("Pelican is flying");
	}

}

	