package com.org.edu.admin.inheritance.example1;

public class WildAnimal extends Animal{

	String type;
	
	public WildAnimal() {
		// TODO Auto-generated constructor stub
	}
	
	public WildAnimal(String type) {
		super();
		this.type = type;
	}
	
	public WildAnimal(String type,String animnalName) {
		super(animnalName);
		this.type = type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String eat(String foodItemName) {
		return super.eat(this.type, foodItemName);
	}
}
