package com.thinkopen.patterns.creational.prototype;

import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();

        Employee clone = (Employee) employee.clone();
        Employee anotherClone = (Employee) employee.clone();

        List<String> clonedEmployees = clone.getEmployees();
        List<String> anotherClonedEmployees = anotherClone.getEmployees();

        clonedEmployees.add("Pedrosa");
        anotherClonedEmployees.remove("Marquez");

        System.out.println("Employees are: " + employee.getEmployees());
        System.out.println("Cloned Employees are: " + clonedEmployees);
        System.out.println("Another Cloned Employees are: " + anotherClonedEmployees);
    }

}
