package lesson26;

import lesson10hw.p4.p5.E;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Doctorr();
        Employee1 emp1 = new Doctorr();
        Employee1 emp2 = new Teacherr();
        Employee1 emp3 = new Driverr();
        Employee1 e = new Employee1();
        Employee1 emp4 = new Employee1();
        Employee1[] array = {emp1, emp2, emp3};
        for (Employee1 e1 : array) {
            if (e instanceof Driverr) {
                System.out.println(((Driverr) e).nazvanieMashini);
            }
        }



        Doctorr d1 = (Doctorr) emp1;
        System.out.println(d1.specializaciya);
        System.out.println("((Doctorr) emp1).specializaciya = " + ((Doctorr) emp1).specializaciya);
        d1.lechit();
        ((Doctorr) emp1).lechit();
        h.help();
        ((Doctorr)emp1).help();
        System.out.println(e == emp1);

    }
}

class Employee1 extends Object {
    double salary = 100;
    String name;
    int age;
    int experience;

    void sleep() {
        System.out.println("Spat");
    }
}

class Doctorr extends Employee1 implements Help_able {
    String specializaciya = "Xirurg";
    void lechit() {
        System.out.println("Lechit");
    }

    @Override
    public void help() {
        System.out.println("Doctor okazivaet pomosh");
    }
}


class Teacherr extends Employee1 {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

}

class Driverr extends Employee1 {
    String nazvanieMashini = "Mercedes";

    void vodit() {
        System.out.println("Vodit");
    }
}

interface Help_able {
    void help();
}
