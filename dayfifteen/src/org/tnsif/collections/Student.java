package org.tnsif.collections;

public class Student implements Comparable<Student> {
	String name;
	int rollno;
	int percentage;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollno, int percentage) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.percentage = percentage;
	}

	@Override
	public int compareTo(Student o) {
		
		return name.compareTo(o.name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", percentage=" + percentage + "]";
	}

	

	
}
