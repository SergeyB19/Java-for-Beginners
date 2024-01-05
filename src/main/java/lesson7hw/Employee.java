package lesson7hw;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;


    public void showSalary() {
        System.out.println(salary);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }

    public Employee(int id) {
        this.id = id;
    }

    Employee(String surname) {
        this.surname = surname;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1_800_000.5);
        Employee employee2 = new Employee("Colins");
        Employee employee3 = new Employee(1);
        employee1.showSalary();
        employee2.showSurname();
        employee3.showId();

    }
}
