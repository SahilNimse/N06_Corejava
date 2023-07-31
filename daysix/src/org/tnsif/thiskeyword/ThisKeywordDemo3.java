package org.tnsif.thiskeyword;
class Team
{
	int size;
	Team()
	{
		//calling to parameterized
		this(7);
		System.out.println("Default constructor");
	}
	Team(int size)
	{
		System.out.println("Parametrized constructor : "+size);
	}
}
public class ThisKeywordDemo3 {

	public static void main(String[] args) {
		Team t=new Team();
	}

}
