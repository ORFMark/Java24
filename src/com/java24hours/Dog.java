package com.java24hours;

public class Dog {
	public String breed = "", name = "";

    public Dog()
    {
    }

    public Dog(String breed, String dogName)
    {
          this.breed = breed;
          name = dogName;
    }

    public void bark()
    {
          System.out.println("My " + breed + " " + name + " is barking!");
    }
}
