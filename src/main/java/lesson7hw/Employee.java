package lesson7hw;

public class Employee {
    protected double salary;
    public String surname;

    protected int id;

    public void showSalary() {
        System.out.println(salary);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }

     public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String surname) {
        this.surname = surname;
    }

    protected Employee(int id) {
        this.id = id;
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
