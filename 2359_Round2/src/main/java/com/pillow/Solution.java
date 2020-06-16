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
		Chicken chick = cf.getInstance("male");
		chick.say();
		Chicken chick2 = cf.getInstance("other");
		chick2.say();
	}

}
