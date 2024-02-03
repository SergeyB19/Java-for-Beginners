package lesson30.homework;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee() {
    }

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    void printEmployee(Employee employee) {
        System.out.println("Имя: " + employee.name + " Департамент: " + employee.department + " Зарплата: " + employee.salary);
    }

    void filtraciyaRabotnikov(ArrayList<Employee> aLEmp, Predicate<Employee> predicate) {
        for (Employee emp : aLEmp) {
            if (predicate.test(emp)) {
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        Employee emp1 = new Employee("Employee1", "Sales", 1_000_000);
        Employee emp2 = new Employee("Employee2", "IT", 2_000_000);
        Employee emp3 = new Employee("Employee3", "Department3", 3_000_000);
        Employee emp4 = new Employee("Employee4", "IT", 4_000_000);
        Employee emp5 = new Employee("Employee5", "Human Resourses", 5_000_000);
        arrayList.add(emp1);
        arrayList.add(emp2);
        arrayList.add(emp3);
        arrayList.add(emp4);
        arrayList.add(emp5);
        TestEmployee te = new TestEmployee();
        te.filtraciyaRabotnikov(arrayList, x -> x.department.equals("IT") && x.salary > 200);
        te.filtraciyaRabotnikov(arrayList, x -> x.name.startsWith("E") && x.salary != 200);
        te.filtraciyaRabotnikov(arrayList, x -> x.name.equals(x.department));


    }
}




