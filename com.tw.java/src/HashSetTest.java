import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		 Set<String> cars = new HashSet<>();
		 
 // in side the Hash Set we can not store duplicate value & we store null value in single time
		 
		 cars.add("BMW");
		 cars.add("Audi");
		 cars.add("Ford");
		 cars.add("Creata");
		 
		 System.out.println(cars);
		 
		 cars.remove("Ford");
		 System.out.println(cars);
		 
		 cars.size();
		 System.out.println(cars.size());
		 
		 cars.contains("Audi");
		 System.out.println(cars.contains("Audi"));
		 
		 for (String i : cars) {
			 System.out.println(i);		 
		 }
		 
		 cars.clear();
		 System.out.println(cars);
	}
}
