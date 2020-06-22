package com.uttara.test;

public class Animal {
	
	
	public String noise()
	{
		return "peep";
	}

	
	
	class Dog extends Animal
	{
		public String noise()
		{
			return "bark";
		}
	}
	class Cat extends Animal
	{
		public String noise()
		{
			return "meow";
		}
	}

	public static void main(String[] args)
	{
		
	Animal animal = new Dog();
	Cat cat=(Cat)animal;
    System.out.println(cat.noise());
	} 
}

