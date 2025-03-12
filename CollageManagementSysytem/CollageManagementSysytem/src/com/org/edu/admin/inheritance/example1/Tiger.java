package com.org.edu.admin.inheritance.example1;

public class Tiger extends WildAnimal{
	
	public static final String ANIMAL_NAME = "TIGER";
	
	public Tiger(String type) {
		super(type);
	}
	
	public Tiger(String type,String animalName) {
		super(type, animalName);
	}
	
	
	@Override
	public String eat(String foodItemName) {
		return super.eat(foodItemName);
	}
	
	public String eat() {
		return super.eat("PIZZA");
	}
	
	public static void main(String[] args){
		Tiger t = new Tiger("NON-VEG", Tiger.ANIMAL_NAME);
		System.out.println(t.eat("GOAT"));
	}
}
