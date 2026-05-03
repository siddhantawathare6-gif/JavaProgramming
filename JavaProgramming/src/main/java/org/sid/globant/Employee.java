package org.sid.globant;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Employee {

    private String name;
    private Integer empId;
    private Double salary;
    private String deptName;
    private LocalDate dateOfJoining;
    private Integer age;

    public Employee(String name, Integer empId, Double salary, String deptName, LocalDate dateOfJoining, Integer age) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.deptName = deptName;
        this.dateOfJoining = dateOfJoining;
        this.age = age;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                ", deptName='" + deptName + '\'' +
                ", doj='" + dateOfJoining + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Employee> getEmployees() {
        return Arrays.asList(new Employee("siddhant", 101, 10000.0, "IT", LocalDate.of(2026, 5, 8), 33),
                new Employee("supriya", 102, 20000.0, "IT", LocalDate.of(2025, 9, 1), 30),
                new Employee("anil", 103, 15000.0, "HR", LocalDate.of(2026, 8, 1), 29),
                new Employee("vivek", 104, 30000.0, "CS", LocalDate.of(2025, 8, 15), 33),
                new Employee("deep", 105, 40000.0, "IT", LocalDate.of(2025, 5, 4), 33));
    }
}
