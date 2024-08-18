
public class ThrowsExample {

	public static void main(String[] args) {
		
		 try {
	            checkAge(15);
	        } catch (Exception e) {
	            System.out.println("Caught exception: " + e.getMessage());
	        }
	    }

	    public static void checkAge(int age) throws Exception {
	        if (age < 18) {
	            throw new Exception("Age must be at least 18 ?");
	        }
	        System.out.println("Age is valid.");
	    }


	}

