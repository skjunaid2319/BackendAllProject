package Encapsulation;

public class Junaid {
	
	                 // What is Encapsulation ?
	
	// Encapsulation is a process  of wriping data & code 
	// to gather in single unit we can achey Encapsulation
	// create variable class private & execess private 
	// variable  by public geter & seter method 
	 
	private int id;
	private String uzerName;
	private String password;
	
	public void setId(int i_id) {
		this.id=i_id;
	}
	
	public int getId() {
		return id;
	}
	public void setUzerName(String name) {
		this.uzerName=name;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getpassword() {
		return password;
	}
	
	public String getName() {
		return uzerName;
	}
		
	}

