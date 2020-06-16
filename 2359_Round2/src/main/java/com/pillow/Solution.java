package com.pillow;

public class Solution {

	public static void main(String[] args) {
		Chicken c = new Chicken();
		c.action("fly", c);
		Duck d = new Duck();
		d.action("swim", d);
		
		d.say();
		c.say();
		
		ChickenFactory cf = new ChickenFactory();
		Chicken rooster = cf.getInstance("male");
		rooster.say();
		Chicken normalChick = cf.getInstance("other");
		normalChick.say();
		
		Parrot p = new ParrotAdapter(rooster);
		p.say();
		Dog dog = new Dog();
		p = new ParrotAdapter(dog);
		p.say();
		Cat cat = new Cat();
		p = new ParrotAdapter(cat);
		p.say();
		
	}

}
