package org.tnsif.multilevelinheritence;


	public class TeamMember extends TeamLead {

	    private String memberName;
	    private int memberId;

	    public String getMemberName() {
	        return memberName;
	    }

	    public int getMemberId() {
	        return memberId;
	    }

	    public void setMemberName(String memberName) {
	        this.memberName = memberName;
	    }

	    public void setMemberId(int memberId) {
	        this.memberId = memberId;
	    }

	    public TeamMember(){
	        super();
	        this.memberName = "John Soe";
	        this.memberId = 1234;
	    }

	    public TeamMember(String memberName, int memberId, String teamName, int teamSize, String leadName, String department, String name, int id){
	        super(teamName, teamSize, leadName, department, name, id);
	        this.memberName = memberName;
	        this.memberId = memberId;
	    }

	    public String toString(){
	        return super.toString() + "\nMember Name: " + this.memberName + "\nMember ID: " + this.memberId;
	    }


	}	
