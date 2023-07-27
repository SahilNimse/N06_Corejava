package org.tnsif.singleinheritence;

public class Citizens{
    private String city;
    private String state;
    private int pin;
    private long aadhar;

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPin() {
        return pin;
    }

    public long getAadhar() {
        return aadhar;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setAadhar(long aadhar) {
        this.aadhar = aadhar;
    }

    public String toString(){
        return "City: " + city + "\nState: " + state + "\nPin: " + pin + "\nAadhar: " + aadhar;
    }

    public Citizens(String city, String state, int pin, long aadhar) {
        super();
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.aadhar = aadhar;
    }

    public Citizens() {
        this.city = "Delhi";
        this.state = "Delhi";
        this.pin = 110001;
        this.aadhar = 123456789012L;
    }


}
