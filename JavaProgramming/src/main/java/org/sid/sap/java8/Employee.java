package org.sid.sap.java8;

import java.util.Arrays;
import java.util.List;

public class Employee {

    private String name;
    private Integer empId;
    private Double dalary;
    private String deptName;
    private String doj;
    private Integer age;

    public Employee(String name, Integer empId, Double dalary, String deptName, String doj, Integer age) {
        this.name = name;
        this.empId = empId;
        this.dalary = dalary;
        this.deptName = deptName;
        this.doj = doj;
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

    public Double getDalary() {
        return dalary;
    }

    public void setDalary(Double dalary) {
        this.dalary = dalary;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
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
                ", dalary=" + dalary +
                ", deptName='" + deptName + '\'' +
                ", doj='" + doj + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Employee> getEmployees() {
        return Arrays.asList(new Employee("siddhant", 101, 10000.0, "IT", "01-05-2026", 33),
                new Employee("supriya", 102, 20000.0, "IT", "01-09-2025", 30),
                new Employee("anil", 103, 15000.0, "HR", "01-08-2026", 29),
                new Employee("vivek", 104, 30000.0, "CS", "15-08-2025", 33),
                new Employee("deep", 105, 40000.0, "IT", "04-05-2025", 33));
    }
}
