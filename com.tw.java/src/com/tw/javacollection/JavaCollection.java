package com.tw.javacollection;

import java.util.ArrayList;
import java.util.List;

public class JavaCollection {

	public static void main(String[] args) {
		
		// Array List 
		
		List<String> Name= new ArrayList<String>();
		Name .add("Mdjunaid");
		Name .add("junaid");
		Name .add("zeeshan");
		Name .add ("sohel");
		System.out.println(Name);
		
		
		// Add method java collection
		Name.add("Faiyaz");
		System.out.println(Name);
		
		// Remove method
		Name.remove(0);
		System.out.println(Name);
		
		// set method value replace
		Name.set(0, "Faiyaz");
		System.out.println(Name);
		
		 // print varibale name Name.get();
		Name.add(3,"junaid");
		System.out.println(Name.get(0));
		
		// delete all method 
		Name.clear();
		System.out.println();
		
		// add first Name
		Name.add(0,"Mdjunaid");
		System.out.println(Name);
		
		// last name method
		Name.add("zeeshan");
		System.out.println(Name);
		
		
		
	
	
	
	}

}
