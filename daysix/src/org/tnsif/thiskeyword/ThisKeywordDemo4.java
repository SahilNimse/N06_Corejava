package org.tnsif.thiskeyword;
class Director{
	String name;
	void print()
	{
		this.name="Christephoer Nolan";
		display(name);
		
	}
	void display(String name)
	{
		System.out.println("Director name is: "+name);
	}
}
public class ThisKeywordDemo4 {

	public static void main(String[] args) {
		Director d=new Director();
		d.print();
	}

}
