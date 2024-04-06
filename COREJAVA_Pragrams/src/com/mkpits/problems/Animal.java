package com.mkpits.problems;

public class Animal {
	  String animalName;
	  int age;

	  public Animal(String animalName, int age) {
	    this.animalName = animalName;
	    this.age = age;
	  }

	  public String getName() {
	    return animalName;
	  }

	  public int getAge() {
	    return age;
	  }

	  public static void main(String[] args) {
	    Animal ani = new Animal("Tiger", 20);

	    String animalName = ani.getName();
	    int age = ani.getAge();

	    System.out.println("Animal Name: " +animalName);
	    System.out.println("Age of Animal : "+age);
	    
	}

}


