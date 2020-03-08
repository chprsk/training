package com.actitime.basics.dummy;

public class Cat implements Animal
{

	@Override
	public void color() {
		System.out.println("Color is black /  white");
		
	}

	@Override
	public String family() {
		// TODO Auto-generated method stub
		return "cat belongs to tiger family";
	}

	
	public static void main(String[] args) {
		
		Animal cat1 = new Cat();
		Animal cat2 = new Cat();
		Animal cat3 = new Cat();
		cat1.color();
		cat1.family();
		
	}
}
