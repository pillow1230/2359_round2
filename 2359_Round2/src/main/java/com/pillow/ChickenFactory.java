package com.pillow;

public class ChickenFactory {
	
	public Chicken getInstance(String gender) {
		if (gender.equals("male"))
			return new Rooster();
		else return new Chicken();
	}
}
