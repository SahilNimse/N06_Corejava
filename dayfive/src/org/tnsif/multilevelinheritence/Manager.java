package org.tnsif.multilevelinheritence;

public class Manager {

    private String department;
    private String name;
    private int id;

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Manager(){
        this.department = "IT";
        this.name = "John Doe";
        this.id = 1234;
    }

    public Manager(String department, String name, int id){
        this.department = department;
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "Department: " + this.department + "\nName: " + this.name + "\nID: " + this.id;
    }
}
