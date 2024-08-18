package com.tw.javacollection;

import java.util.ArrayList;
import java.util.Iterator;                   


public class Junaid {
	    public static void main(String[] args) {
	        // Create an ArrayList for each wrapper class
	        ArrayList<Integer> intList = new ArrayList<>();
	        ArrayList<Double> doubleList = new ArrayList<>();
	        ArrayList<Character> charList = new ArrayList<>();
	        ArrayList<Boolean> booleanList = new ArrayList<>();
	        ArrayList<Byte> byteList = new ArrayList<>();
	        ArrayList<Short> shortList = new ArrayList<>();
	        ArrayList<Long> longList = new ArrayList<>();
	        ArrayList<Float> floatList = new ArrayList<>();
	        
	        // Adding elements
	        intList.add(10);
	        doubleList.add(20.5);
	        charList.add('A');
	        booleanList.add(true);
	        byteList.add((byte) 1);
	        shortList.add((short) 100);
	        longList.add(1000L);
	        floatList.add(10.5f);
	        
	        // Adding all elements from another collection
	        ArrayList<Integer> anotherIntList = new ArrayList<>();
	        anotherIntList.add(20);
	        anotherIntList.add(30);
	        intList.addAll(anotherIntList);
	        
	        // Check if the list contains specific elements
	        System.out.println("intList contains 10: " + intList.contains(10));
	        System.out.println("doubleList contains 20.5: " + doubleList.contains(20.5));
	        
	        // Check if the list contains all elements from another collection
	        System.out.println("intList contains all elements of anotherIntList: " + intList.containsAll(anotherIntList));
	        
	        // Remove elements
	        intList.remove(Integer.valueOf(10));
	        doubleList.remove(Double.valueOf(20.5));
	        
	        // Remove all elements from another collection
	        intList.removeAll(anotherIntList);
	        
	        // Retain only the elements in the list that are contained in the specified collection
	        ArrayList<Integer> retainList = new ArrayList<>();
	        retainList.add(10);
	        intList.add(10);
	        intList.add(40);
	        intList.retainAll(retainList);
	        
	        // Get the size of the list
	        System.out.println("Size of intList: " + intList.size());
	        System.out.println("Size of doubleList: " + doubleList.size());
	        
	        // Convert to array
	        Object[] intArray = intList.toArray();
	        for (Object obj : intArray) {
	            System.out.println("Element in intArray: " + obj);
	        }
	        
	        // Clear the list
	        charList.clear();
	        
	        // Check if the list is empty
	        System.out.println("charList is empty: " + charList.isEmpty());
	        
	        // Iterate through the list using an iterator
	        Iterator<Integer> iterator = intList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println("Iterating intList: " + iterator.next());
	        }
	        
	        // Iterate using enhanced for loop
	        for (Boolean bool : booleanList) {
	            System.out.println("Element in booleanList: " + bool);
	        }
	    }
	}

