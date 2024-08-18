
public class ExceptionExample {

	public static void main(String[] args) {

		  int[] numbers = {10, 20, 30, 40, 50};

	        try {
	            int invalidElement = numbers[60];
	            
	            System.out.println("The element is: " + invalidElement);
	        } catch (ArrayIndexOutOfBoundsException e) {
	           
	        	// Handle the exception
	        	
	            System.out.println("Error: Array index is out of bounds.");
	        }

	        System.out.println("Program continues after handling the exception.");
	    }
	
	    	 
		
	
	}


