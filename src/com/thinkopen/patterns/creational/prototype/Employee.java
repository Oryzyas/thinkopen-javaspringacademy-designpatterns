package com.thinkopen.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
    private List<String> employees;

    public Employee() {
        employees = new ArrayList<>();
    }

    public Employee(List<String> employees) {
        this.employees = employees;
    }

    public void loadData() {
        employees.add("Marquez");
        employees.add("Valentino Rossi");
        employees.add("Dovizioso");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> clone = new ArrayList<>();
        clone.addAll(employees);
        return new Employee(clone);
    }
}
