package org.tnsif.superkeyword;
class MET{
	String ownerName="Chagan Bhujbal";
	void displayName()
	{
		System.out.println("Owner is: "+ownerName);
	}
}
class BKC extends MET{
	String ownerNAME="Shefai Bhujbal";
	void displayNmae()
	{
		super.displayName();
		System.out.println("Owner is "+ownerName);
	}
	
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b=new BKC();
		b.displayName();

	}

}
