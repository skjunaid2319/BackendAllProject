package SpringXml;

public class Student {
	
	private String name;
	private String rollno;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
		System.out.println("Emai :"+email);
	}

}
