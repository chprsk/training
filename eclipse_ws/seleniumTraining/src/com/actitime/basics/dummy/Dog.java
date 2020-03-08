package com.actitime.basics.dummy;

public class Dog 
{

	public static void main(String[] args) {
		
		Animal dog = new Animal() 
		{
			public void color() {
				System.out.println("Color is black");
			}

			@Override
			public String family() {
				// TODO Auto-generated method stub
				return "DOG FAMILY";
			}
		};
		
		Animal cat = new Animal() 
		{
			public void color() {
				System.out.println("Color is white");
			}

			@Override
			public String family() {
				// TODO Auto-generated method stub
				return "CAT FAMILY";
			}
		};
	}
	
	

}
