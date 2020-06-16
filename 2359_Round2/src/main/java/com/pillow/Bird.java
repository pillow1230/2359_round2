package com.pillow;

public abstract class Bird implements Animal {

	public void action(String action, Bird bird) {
		if (action.equals("fly") && !(bird instanceof Chicken))
			System.out.println("i am flying");
		else if (action.equals("sing"))
			System.out.println("i am singing");
		else if (action.equals("swim") && (bird instanceof Duck)) 
			System.out.println("i am swimming");
		else 
			System.out.println("i am walking");
	}
	
	abstract void say();

}
