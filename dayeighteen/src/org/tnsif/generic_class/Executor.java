package org.tnsif.generic_class;

public class Executor {

	public static void main(String[] args) {
		
		Integer a[]= {30,20,10};
		String str[]= {	"Aizenh","Urahara","Kenpachi","Yamamoto"};
		Float price[]= {3.3f,2.3f,1.1f};
		
		ArrayOperations.sortArray(a);
		ArrayOperations.display(a);
		ArrayOperations.sortArray(str);
		ArrayOperations.display(str);
		ArrayOperations.sortArray(price);
		ArrayOperations.display(price);

	}

}
