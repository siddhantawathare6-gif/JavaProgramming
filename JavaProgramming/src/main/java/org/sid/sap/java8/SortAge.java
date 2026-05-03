package org.sid.sap.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAge {
    public static void main(String[] args) {
        List<Employee> emp = Employee.getEmployees();
        List<Employee> collect = emp.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
