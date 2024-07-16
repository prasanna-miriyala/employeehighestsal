package org.example;

import java.util.*;
import java.util.stream.Collectors;


public class HighestSalary {
    public  static void main(String args[]){
        Employee e= new Employee ( "Prasanna",32,8,"IT1" );
        Employee e1= new Employee ( "Prasanna1",33,7,"IT1" );
        Employee e2= new Employee ( "Prasanna2",31,2,"IT2" );
        Employee e3= new Employee ( "Prasanna3",34,3,"IT3" );

        Employee e4= new Employee ( "Prasanna3",34,4,"IT3" );
        List<Employee> employeeList= Arrays.asList ( e,e1,e2,e3,e4 );
      Map<String,Employee> map= employeeList.stream().collect( Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen
                        (Collectors.maxBy( Comparator.comparingInt(Employee::getSalary))
                                ,emp->emp.get())));
        map.entrySet().forEach(System.out::println);
       // System.out.println (employeeList.stream().collect( Collectors.groupingBy(Employee::getDepartment)) );
       // System.out.println (employeeList.stream().collect( Collectors.groupingBy(Employee::getDepartment,
        //Collectors.maxBy( Comparator.comparingInt(Employee::getSalary)))));
    }
    }



