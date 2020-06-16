package com.pillow;

public class Bird implements Animal {

	public void action(String action) {
		if (action.equals("fly"))
			System.out.println("i am flying");
		else if (action.equals("sing"))
			System.out.println("i am singing");
		else 
			System.out.println("i am walking");
	}

}
