//QUESTION 4 B): WAP using java 8:
//
//    -> Given a list of objects of following class:
//
//           class Employee{
//           String fullName;
//           Long salary;
//           String city;
//           }
//
//          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
//          Note: Full name is concatenation of first name, middle name and last name with single space in between.

package coreJavaTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;


class Employee {
    String fullName;
    Long salary;
    String city;


    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}

public class Question4StreamsPart2 {
    public static void main(String[] args){
        List<Employee> employees= Arrays.asList(
                new Employee("Ajay Kumar", 4000L, "Delhi"),
                new Employee("Anita Singh", 6000L, "Delhi"),
                new Employee("Rahul Mahajan", 3000L, "Delhi"),
                new Employee("Suresh Gupta", 4500L, "Mumbai"),
                new Employee("Divya kapoor", 3500L, "Delhi"),
                new Employee("Raj Sharma", 4000L, "Delhi")
        );
        List<String> uniqueFirstNames = employees.stream()
                .filter(emp -> emp.salary < 5000 && emp.city.equalsIgnoreCase("Delhi"))
                .map(emp -> emp.fullName.split(" ")[0]).distinct()
                .collect(Collectors.toList());

        System.out.println("Unique First Names of employees with salary less than 5000: " + uniqueFirstNames);
    }
}



