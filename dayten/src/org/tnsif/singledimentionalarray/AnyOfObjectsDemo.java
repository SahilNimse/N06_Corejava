package org.tnsif.singledimentionalarray;

public class AnyOfObjectsDemo {

	public static void main(String[] args) {
		Employee arr[]=new Employee[3];
		arr[0] = new Employee(101,"Aizen",50000.50);
		arr[1] = new Employee(102,"Ichigo",90000.50);
		arr[2] = new Employee(103,"Urahara",70000.92);
		{
			System.out.println("YO KOSO WATASHI NO SOUL SOCITY\n");
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());	
		}
		

	}

}
