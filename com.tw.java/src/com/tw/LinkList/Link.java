package com.tw.LinkList;

import java.util.LinkedList;
import java.util.List;

public class Link {

	private static final String R15 = null;

	public static void main(String[] args) {
		 List<String> bike = new LinkedList<String>();
		 bike.add("Spotr bike");
		 bike.add("R15");
		 bike.add("Hai abuza");
		 System.out.println(bike);
		 
		 bike.remove(0);
		 System.out.println(bike);
		 
		 bike.set(0, "New bike");
		 System.out.println(bike);
		 
		bike.clear();
		System.out.println(bike);
		
		
		 

		
		 
	}

}
