package org.example;

public class Bus {
    private int busNo;
    private String acDetails;
    private int capacity;

    public Bus(int busNo,String acDetails,int capacity) {
        this.busNo = busNo;
        this.acDetails = acDetails;
        this.capacity=capacity;

    }

    public String getAcDetails() {
        return acDetails;
    }

    public void setAcDetails(String acDetails) {
        this.acDetails = acDetails;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayBusInfo()
    {
        System.out.println("Bus details are "+busNo+capacity+acDetails);

    }
}
