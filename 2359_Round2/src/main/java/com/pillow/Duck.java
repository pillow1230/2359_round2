package com.pillow;

public class Duck extends Bird{

	@Override
	void say() {
		System.out.println("Quack, quack");
	}
	
	public void swim() {
		System.out.println("i am swimming");
	}
}
