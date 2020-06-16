package com.pillow;

public class ParrotAdapter extends Parrot{

	Animal nearbyAnimal;
	
	public ParrotAdapter(Animal nearbyAnimal) {
		super();
		this.nearbyAnimal = nearbyAnimal;
	}

	public void say() {
		if (nearbyAnimal instanceof Rooster) {
			Rooster rooster = (Rooster) nearbyAnimal;
			rooster.say();
		} else if (nearbyAnimal instanceof Dog) {
			Dog dog = (Dog) nearbyAnimal;
			dog.say();
		} else if (nearbyAnimal instanceof Cat) {
			Cat cat = (Cat) nearbyAnimal;
			cat.say();
		} else {
			System.out.println("I dont know how to speak this animal language yet!");
		}
	}


}
