package com.tylerfuqua.interfaces;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		System.out.println(d.speak());
		System.out.println(d.run());
		System.out.println(d.eat());
		
		Cat c = new Cat();
		System.out.println(c.speak());
		System.out.println(c.run());
		System.out.println(c.eat());
		
		Cow co = new Cow();
		System.out.println(co.speak());
		System.out.println(co.run());
		System.out.println(co.eat());
		
		Turtle t = new Turtle();
		System.out.println(t.eat());
		System.out.println(t.crawl());
		
		Lizard l = new Lizard();
		System.out.println(l.eat());
		System.out.println(l.crawl());
	}

}
