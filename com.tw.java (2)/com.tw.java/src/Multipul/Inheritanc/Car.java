package Multipul.Inheritanc;

public class Car {

	public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Car {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Car {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
