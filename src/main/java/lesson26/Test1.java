/*
package lesson26;

public class Test1 {
    public static void main(String[] args) {
        Driver[] array1 = {new Driver(), new Driver()};
        Employee1[] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        Help_able[] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};

        Employee1 emp1 = new Teacher();
        Employee1 emp2 = new Driver();
        Employee1 emp3 = new Doctor();
        Employee1[] array4 = {emp1, emp2, emp3};
        System.out.println("(emp1 instanceof Employee) = " + (emp1 instanceof Employee1));
        System.out.println("(emp1 instanceof Teacher) = " + (emp1 instanceof Teacher));
        System.out.println("(emp1 instanceof Driver) = " + (emp1 instanceof Driver));
        System.out.println("(emp1 instanceof Help_able) = " + (emp1 instanceof Help_able));


        Help_able h = new Teacher();
        emp1.work();
        emp2.work();
        emp3.work();
        for (Employee1 emp : array4) {
            emp.work();
        }
    }
}

abstract class Employee implements Help_able {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee1 implements Help_able {
    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee1 {
    @Override
    void work() {
        System.out.println("Driver works");
    }

    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee1 {
    @Override
    void work() {
        System.out.println("Doctor works");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}

interface Help_able {
    void help();
}
*/
