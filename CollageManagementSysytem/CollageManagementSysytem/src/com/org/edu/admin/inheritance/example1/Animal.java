package com.org.edu.admin.inheritance.example1;

public class Animal {
	
	String name;
	String color;
	int noOfLegs;
	float height;
	float weight;
	String type;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name) {
		super();
		this.name = name;
	}



	public Animal(String name, String color, int noOfLegs, float height,
			float weight, String type) {
		super();
		this.name = name;
		this.color = color;
		this.noOfLegs = noOfLegs;
		this.height = height;
		this.weight = weight;
		this.type = type;
	}

	public Animal(String name, String color, int noOfLegs, float height,
			float weight) {
		super();
		this.name = name;
		this.color = color;
		this.noOfLegs = noOfLegs;
		this.height = height;
		this.weight = weight;
	}

	public Animal(String name, String color, int noOfLegs, float height) {
		super();
		this.name = name;
		this.color = color;
		this.noOfLegs = noOfLegs;
		this.height = height;
	}
	
	public String getDetails()
	{
		return  "Animal [name=" + name + ", color=" + color + ", noOfLegs="
				+ noOfLegs + ", height=" + height + ", weight=" + weight
				+ ", type=" + type + "]";
	}
	
	public String eat(String foodType,String foodItemName){
		return 	this.name + " is "+foodType+" and eating "+foodItemName;
	}
}
