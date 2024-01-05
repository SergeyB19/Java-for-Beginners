package lesson7hw;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee(12);
        Employee employee2 = new Employee("Colins");
//        Employee employee3 = new Employee(1_800_000.5);
        employee1.showId();
        employee2.showSurname();
//        employee3.showSalary();
    }
}
