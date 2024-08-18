package com.tw.javacollection;

import java.util.ArrayList;
import java.util.List;

public class WrapirClass {

	public static void main(String[] args) {
	
		List<Integer> intList = new ArrayList<>();
		List<Double> DouList = new ArrayList<>();
		List<Character> charList = new ArrayList<>();
		List<Boolean> bolList = new ArrayList<>();
		List<Byte> ByteList = new ArrayList<>();
		List<Short> shortList = new ArrayList<>();
		List<Long> longList = new ArrayList<>();
		List<Float> FloatList = new ArrayList<>();
		
		intList .add(10);
		System.out.println("Add Method" +intList);
		
		intList.remove(0);
		System.err.println(intList);
		
		intList.clear();
		System.err.println(intList);
		
		DouList.add(20.5);
		System.out.println("Add Method" +DouList);
		
		charList.add('M');
		System.out.println("Add Method" +charList);
		
		bolList.add(true);
		System.out.println("Add Method" +bolList);
		
		ByteList.add((byte)1);
		System.out.println("Add" +ByteList);
		
		 shortList.add((short) 100);
		System.out.println("Add Method" +shortList);
		
		
		longList.add(10009L);
		System.out.println("Add Method" +longList);
		
	
		FloatList.add(10.5f);
		System.out.println("Add method" +FloatList);
		
		
		

	}

}
