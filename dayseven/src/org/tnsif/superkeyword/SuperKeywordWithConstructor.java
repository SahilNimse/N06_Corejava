package org.tnsif.superkeyword;
//program to demonstrate on super Constructor
class Luffy
{
	String ceo;

	public Luffy(String ceo) {
		System.out.println("Default Constructor:"+ceo);
		
	}
	
}
class Zoro extends Luffy
{
	String userid;
	
	public Zoro(String ceo, String userid) {
		//calling to parent class parameterized constructor
		super(ceo);
		this.userid = userid;
		System.out.println(userid);		
	}
	
	}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		//calling to parent class parameterized constructor
		Luffy g = new Zoro("Oda","Strawhats.com");


		

	}

}
