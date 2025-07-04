package com.tap.sayali.HR;

public class Employee {

    protected int id;
    protected String name;
    protected double salary;
    protected Address address;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public void display() {
        System.out.println("id:" + id + ",name:" + name + ",salary:" + salary);
        if (address != null) {
            address.display();

        }
    }
}
