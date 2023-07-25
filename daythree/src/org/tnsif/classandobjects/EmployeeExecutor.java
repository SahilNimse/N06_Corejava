package org.tnsif.classandobjects;

public class EmployeeExecutor {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.empID=132981;
		e.empName="Sahil Nimse";
		e.salary=78000;
		e.department="Computer";
		//method call
		e.display();
		
	}

}
