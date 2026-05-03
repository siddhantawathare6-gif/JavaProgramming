package org.sid.sap.java8;

import java.util.List;

public class FilterName {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();
        List<Employee> list = employees.stream().filter(emp -> emp.getName().startsWith("s")).toList();
        System.out.println(list);
    }
}
