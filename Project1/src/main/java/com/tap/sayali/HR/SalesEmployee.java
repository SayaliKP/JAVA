package com.tap.sayali.HR;

public class SalesEmployee extends Employee {
    private double commission;

    public SalesEmployee(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;

    }

    public void display() {
        super.display();
        System.out.println("Commission: " + commission);
    }

}
