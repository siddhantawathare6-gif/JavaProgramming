package org.sid.sap.java8;

import java.util.Comparator;
import java.util.List;

public class AgeThenFirstName {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();
        List<Employee> list = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge)
                        .thenComparing(Employee::getName))
                .toList();
        System.out.println(list);
    }
}
