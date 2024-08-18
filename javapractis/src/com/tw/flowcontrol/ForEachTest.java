package com.tw.flowcontrol;

import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		
		List<String> Listofemployess=List.of("mdjunaid","zeeshan","junaiduddin","mohsin");
		
		for(String emp:Listofemployess) {
			
			System.out.println(emp);
		}

	}

}


