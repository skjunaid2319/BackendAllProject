
public class ThrowExample {

	public static void main(String[] args) {
		
		try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}


