//program to demonstrate on:
//this keyword is used to refer the current instance if s class
package org.tnsif.thiskeyword;
class Account
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
//driver class
public class ThisKeywordDemo1 {

	public static void main(String[] args) {
		Account a=new Account();
		a.setDta(6464896264L);
		a.display();

	}

}
