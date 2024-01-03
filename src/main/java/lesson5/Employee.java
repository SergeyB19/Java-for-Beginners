package lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    int department;

    public Employee(int id, String surname, int age, double salary, int department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double salaryTwo(double money) {
        return salary *= money;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ivanov", 30, 790000.23, 5);
        Employee employee2 = new Employee(2, "Pike", 19, 3_000_000.42, 7);
        System.out.println("Новая зарплата сотрудника: " + employee1.surname + " " + employee1.salaryTwo(2) + "\n" +
                "Новая зарплата сотрудника: " + employee2.surname + " " +  employee2.salaryTwo(2));
    }


}
