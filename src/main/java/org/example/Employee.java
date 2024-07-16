package org.example;

public class Employee   {
    @Override
    public String toString ( ) {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    private String name;
    private int age;
    private  int salary;
    private String department;
    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge ( ) {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getDepartment ( ) {
        return department;
    }

    public void setDepartment (String department) {
        this.department = department;
    }

    public int getSalary ( ) {
        return salary;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    public Employee (String name, int age, int salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }





}
