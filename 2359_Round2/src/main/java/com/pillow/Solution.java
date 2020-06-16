package com.pillow;

public class Solution {

	public static void main(String[] args) {
//		Bird bird = new Bird();x/
//		bird.action("fly");
//		Duck duck = new Duck();
//		duck.action(action, bird);
//		Duck duck2 = new Duck();
//		System.out.println(bird instanceof Duck);
		Chicken c = new Chicken();
		c.action(null, c);
		Duck d = new Duck();
		d.action("swim", d);
	}

}
