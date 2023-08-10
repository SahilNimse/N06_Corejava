package org.tnsif.interfacedemo;
//driver class
public class InterfaceExecutor {
	
	public static void main(String[] args) {
	
		SonyTV s=new SonyTV();
		s.display();
		Sony.accept();
		s.show();
		
		NASA i=new NASA();
		i.status();	
		
		Human h=new Human();
		h.showDrinks();
	}

}
