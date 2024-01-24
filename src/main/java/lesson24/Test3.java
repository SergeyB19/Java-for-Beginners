package lesson24;

public class Test3 {
    public static void main(String[] args) {
       /* Employee1 e = new Employee1();
        Teacher1 t = new Teacher1();
        e.eat();
        t.eat();*/
        Employee1 e = new Employee1();
        e.eat();
    }
}

class Eda {
}

class Fruckti extends Eda {

}

class Employee1 extends Object {
    double salary = 100;
    String name;
    int age;
    int experience;

   public Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher1 extends Employee {
    int kolichestvoUchenikov;

   public Fruckti eat() {
        System.out.println("Kushaet uchitel");
        Fruckti f = new Fruckti();
        return f;
    }

    void uchit() {
        System.out.println("Uchit");
    }

}

class A {
    Employee objectCreation() {
        return new Employee();
    }
}

class B extends A {
    Teacher objectCreation() {
        System.out.println("ok");
        return new Teacher();
    }
}

class H extends Teacher {

}
