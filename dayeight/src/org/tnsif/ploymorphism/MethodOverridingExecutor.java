package org.tnsif.ploymorphism;
class DonaldTrump
{
	static void corruption(String str , float ammount1)
	{
		System.out.println("Donald Trump Corruption Amount Is "+ammount1);
	}
}
class America extends DonaldTrump
{
	 static void corruption(String str2 , float ammount2)
	{
		DonaldTrump.corruption("Ajit pawar",5659896.255f);
		System.out.println("America Corruption Amount Is "+ammount2+" Million");
		System.out.println("\nBREAKING NEWS: \nCIA Will Take Strict Actions Towards Trump And He Will Be In Jail After Few Days.");
	}
}
public class MethodOverridingExecutor{

	public static void main(String[] args) {
		America.corruption("dev", 100.321f);
		
	}

}