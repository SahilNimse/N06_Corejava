package org.tnsif.multilevelinheritence;

public class TeamLead extends Manager{


	  private String teamName;
	    private int teamSize;
	    private String leadName;

	    public String getTeamName() {
	        return teamName;
	    }

	    public int getTeamSize() {
	        return teamSize;
	    }

	    public String getLeadName() {
	        return leadName;
	    }

	    public void setTeamName(String teamName) {
	        this.teamName = teamName;
	    }

	    public void setTeamSize(int teamSize) {
	        this.teamSize = teamSize;
	    }

	    public void setLeadName(String leadName) {
	        this.leadName = leadName;
	    }

	    public TeamLead(){
	        super();
	        this.teamName = "Team 1";
	        this.teamSize = 10;
	        this.leadName = "John Moe";
	    }

	    public TeamLead(String teamName, int teamSize, String leadName, String department, String name, int id){
	        super(department, name, id);
	        this.teamName = teamName;
	        this.teamSize = teamSize;
	        this.leadName = leadName;
	    }

	    public String toString(){
	        return super.toString() + "\nTeam Name: " + this.teamName + "\nTeam Size: " + this.teamSize + "\nLead Name: " + this.leadName;
	    }


	}




