package lesson23;

import javax.print.Doc;

public class Test3 {
    void uvelichZP(Employee e) {
        e.salary += 100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
//        doc.specializacia = "xirurg";
        doc.sleep();
        doc.lechit();
    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
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

class Xirurg extends Doctor {
    String skalpel;

    void operaciya() {

    }
}

class Dantist extends Doctor {

}