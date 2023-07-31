package org.tnsif.thiskeyword;
class bank
{
	long accountNo;
	void setDta(long accountNo)
	{
		this.accountNo=accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
	}
}
public class ThisKeywordDemo2 {

	public static void main(String[] args) {
		bank b=new bank();
		b.setDta(6464896264L);
		b.display();
		

	}

}
