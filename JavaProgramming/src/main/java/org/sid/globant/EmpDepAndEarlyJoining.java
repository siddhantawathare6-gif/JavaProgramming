package org.sid.globant;

//- Given a list of employees, write a Java 8 code to count the number of employees in each department?
//- Get first 3 employee who join the org early

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpDepAndEarlyJoining {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        System.out.println(collect);
        List<Employee> collect1 = employees.stream().sorted(Comparator.comparing(Employee::getDateOfJoining)).limit(3).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
