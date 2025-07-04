package com.tap.sayali.demo;

import com.tap.sayali.HR.Address;
import com.tap.sayali.HR.SalesEmployee;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Address addr = new Address("Pune", "Maharashtra", "412207");
        SalesEmployee salesEmp = new SalesEmployee(10, "Sayali", 20000, 50000);

        salesEmp.display();
    }
}
