package com.tw.oops;

public class Hello {

	public static void main(String[] args) {
		
		private long id;
		private double salary;
		private String name;
		
		/**
		 * This method is used to set the ID of Employee
		 * suppose someone call the Employee.setID(4) the ID of Employee will become 4
		 **/
		
		public void setId(long idd) {
			this.id=idd;
		}
		
		
		/**
		 * This method is used to get the id of Employee
		 **/
		public long getId() {
			return this.id;
		}
		
		
		public void setSalary(double salary) {
			this.salary=salary;
		}
		
		public double getSalary() {
			return this.salary;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public String getName() {
			return this.name;
			
			
		}
		
		
	}












	}

}
