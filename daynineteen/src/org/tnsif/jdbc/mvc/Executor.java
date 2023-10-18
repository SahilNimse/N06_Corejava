package org.tnsif.jdbc.mvc;

import java.sql.SQLException;
import java.util.List;

public class Executor {

	public static void main(String[] args) {

		StudentServiceImp1 service;
		List<Student> studList;
		int n;
		Student st;
		try {
			service = new StudentServiceImp1();
				
				
			studList = service.getAllStudents();
			System.out.println(studList.isEmpty()?"No students available":"---All Students---\n"+studList);

			System.out.println("----------------------------------");
			studList = service.getStudentsByPer(75);
			System.out.println(studList.isEmpty()?"No students available":"-----Students with 75 and more percentage----\n"+studList);
			
			System.out.println("----------------------------------");
			studList = service.getStudentsNameStartsWith("n%");
			System.out.println(studList.isEmpty()?"No students available":"----Students name starts with N-----\n"+studList);
			
			System.out.println("----------------------------------");
				
			n=service.updateStudentPer(10);
			System.out.println(n>0?n+" record(s) updated...":"No students available");
			
			studList = service.getAllStudents();
			System.out.println(studList.isEmpty()?"No students available":"---All Students---\n"+studList);
			
			n=service.updateStudentPerByRollNo(6, 50);
			System.out.println(n>0?n+" record(s) updated...":"No students available");
			
			studList = service.getAllStudents();
			System.out.println(studList.isEmpty()?"No students available":"---All Students---\n"+studList);
			

		} catch (SQLException e) { 
			e.printStackTrace();
		}

	}

}
