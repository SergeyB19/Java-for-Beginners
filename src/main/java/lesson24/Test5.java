package lesson24;

public class Test5 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Teacher t = new Teacher();
        Employee e = new Teacher();
        t.sleep();
        e.sleep();
    }
}

class EmployeeOne extends Object {
    double salary = 100;
    String name;

    Fruckti eat() {
        System.out.println("Kushat");
        return null;
    }

    public void sleep() {
        System.out.println("Spit rabotnik");
    }
}

class DoctorOne extends Employee {
    void lechit() {
        System.out.println("Lechit");
    }
}

class XirurgOne extends Doctor {
    String skalpel;

    void operaciya() {
    }
}

class TeacherOne extends Employee {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    public void sleep() {
        System.out.println("Spit uchitel");
    }

}

class DriverOne extends Employee {
    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }
}

class T {

}

class P extends T {
}
