package com.tylerfuqua.interfaces;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.speak();
		d.run();
		
		Cat c = new Cat();
		c.speak();
		c.run();
		
		Cow co = new Cow();
		co.speak();
		co.run();
	}

}
