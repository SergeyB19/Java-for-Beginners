package lesson24;

public class Test2 {
    /*public Object abc() {
        return new String("");
    }*/

    public static void main(String[] args) {
/*      *//*  Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();*//*
        Xirurg x = new Xirurg();*/

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();




        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Doctor d2 = new Xirurg();
        d2.lechit();
        d2.eat();
        d2.sleep();
        Employee emp4 = new Xirurg();
        emp4.eat();
        emp4.sleep();



    }
}

class Employee extends Object {
    double salary = 100;
    String name;
    int age;
    int experience;

    Fruckti eat() {
        System.out.println("Kushat");
        return null;
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor extends Employee {
    void lechit() {
        System.out.println("Lechit");
    }
}

class Xirurg extends Doctor {
    String skalpel;

    void operaciya() {
    }
}

class Teacher extends Employee {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

}

class Driver extends Employee {
    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }
}

