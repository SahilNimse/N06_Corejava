package org.tnsif.singleinheritence;

public class Student extends Citizens{
    
    private int rollNo;
    private String collegeName;

    public int getRollNo() {
        return rollNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String toString(){
        return "Roll No: " + rollNo + "\nCollege Name: " + collegeName + "\n" + super.toString();
    }

    public Student(int rollNo, String collegeName, String city, String state, int pin, long aadhar) {
        super(city, state, pin, aadhar);
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }

    public Student() {
        this.rollNo = 1;
        this.collegeName = "ABC";
    }
}