package org.tnsif.coodingchallenge;

public class ProductExceptcurIndex {
//	 Input: 
//	 [1,2,3,4]
//	 Output:
//	 [24,12,8,6]
public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	int sum=1;
	for(int i=0;i<4;i++) {
		sum*=arr[i];
	}
	for(int i=0;i<4;i++) {
		arr[i]=sum/arr[i];
	}
	
	for(int x:arr) {
		System.out.print(x+" ");
	}
}
}
