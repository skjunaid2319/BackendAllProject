package com.tw.java;

public class JavaStringMethods {

	public static void main(String[] args) {
		
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);
		// out put (H)
//		
		String myStr1 = "Hello";
		int result1 = myStr1.codePointAt(0);
		System.out.println(result1);
//		
		String myStr2 = "Hello";
		int resul2 = myStr2.codePointBefore(1);
		System.out.println(resul2);
		//Return the Unicode of the first character in a string (the Unicode value of "H" is 72):

          
		//Return the number of Unicode values found in a string:
		
		String myStr3 = "Hello";
		int result3 = myStr.codePointCount(0, 5);
		System.out.println(result3);
		
		
		String myStr4 = "Hello";
		String name4 = "Hello";
		System.out.println(myStr4.compareTo(myStr4));
		// out put (0)
		
		String myStr5 = "whare are you from";
		String name5 = "im from Nander";
		System.out.println(myStr5.compareToIgnoreCase(myStr5));
		// out put (0)
		
		String firstName = "junaid" ;
		String lastName = " Hello";
		System.out.println(firstName.concat(lastName));
		
		    String myStr6 = "Hello";
		    System.out.println(myStr6.contains("Hel"));
		    System.out.println(myStr6.contains("o"));
		    System.out.println(myStr6.contains("Hi"));
		    // out put true / false 
		    
		    String myStr7= "what";
		    
		    System.out.println(myStr7.contentEquals("what"));
		    System.out.println(myStr.contentEquals("wh"));
		    System.out.println(myStr.contentEquals("e"));
		    // out put true / false 
		    
//		    char [] myStr8 = {'H','E','l','l','o'}; 
//		    String myStr9= "";
//		    name = name.copyValueOf(myStr1, 0, 5);
		    
		    String  myName= "junaid";
		    System.out.println(myName.endsWith("junaid"));
		    System.out.println(myName.endsWith("Hai"));
		    // out put is true/ false
		    
		    String myName1 = "Hello";
		    String myName2 = "Hi";
		    String myName3 = "welcome";
		    System.out.println(myName1.equals(myName2));
		    // out put is false
		    
		    String myName4 = "Hello";
		    byte[] myName5 = myStr.getBytes();
		    System.out.println(myName5[0]);
		    // out put is 72

		    char [] myArray = {'0','1','2','3','4','5',};
		    System.out.println(myArray);
		    // out put is 012345 
		    
		    String myName6 = "Hi";
		    System.out.println(myName6.hashCode());
		    //out put is 2337
		    
		    String newName = " im full stack developer";
		    System.out.println(newName.indexOf("full"));
		    // out put is 4 
		    
		    
		    
		    
		    
		    
		    
		    
		   
		    
		    
			    


	}

}
