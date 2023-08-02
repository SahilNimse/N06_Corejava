package org.tnsif.staticdemo;
class Student
{
	private String name;
	private int rollno;
	private static String Branch="comp";
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
	public static String getBranch() {
		return Branch;
	}
	public static void setBranch(String branch) {
		Branch = branch;
	}
	
	void display()
	{
		System.out.println("rollno: "+this.getRollno()+" name:"+this.getName()+" branch:"+Student.getBranch());
	}
}

public class StaticVariable {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("devansh");
		s.setRollno(05);
		s.display();
		
		Student s1 = new Student();
		s.setName("sahil");
		s.setRollno(72);
		s.display();
	}

}