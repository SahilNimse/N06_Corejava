package encapulation;

public class EncapulationDemo {

	public static void main(String[] args) {
			HDFC h = new HDFC();
			// setting a value to private data members
			h.setAccType("Svaing Account ");
			h.setAccNo(122587469355L);
			h.setAtmCardNo(158664649946464L);
			h.setPinNo(1221);
			
			System.out.println("the Account no is =" +h.getAccNo());
			System.out.println("the account type is =" +h.getAccType());
			System.out.println("the account atm pin is = " +h.getPinNo());

			// System.out.println(h);

			
		}


	}

