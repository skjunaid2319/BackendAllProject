package polymorfisim;

public class Main {
	
	//  What is Polymorphism
	
	// is a process of  perform one task in different
	// ways  (like) man & son & is a father & is a husbnd
	// is a employee & ect that is Polymorphism

	public static void main(String[] args) {
		
		Car cr = new Car();
		ElectricCar el = new ElectricCar();
		Cng  cg = new Cng();
		
		cr.reful();
		el.charging();
		cg.cng();
	

	}

}
