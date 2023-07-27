package org.tnsif.multilevelinheritence;

public class EmployeeExecutor {
	    public static void main(String[] args) {

	        TeamMember tm = new TeamMember();
	        System.out.println(tm);

	        System.out.println();

	        TeamMember tm2 = new TeamMember("member1", 1234, "Team 1", 10, "lead1", "IT", "manager1", 307);
	        System.out.println(tm2);

	    }
	}
