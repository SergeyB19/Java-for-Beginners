package lesson23;

public class Test4 {

}

class Human2 {

  /*  public Human2() {
    }*/
        Human2(String n) {
        this(n, null);
    }

    public Human2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /*  public Human2(String n, String s) {
        name = n;
        surname = s;
    }*/

    public String name;
    public String surname;
}

class Student2 extends Human2 {
    int course;

    public Student2(String name, String surname, int course) {
        super(name,surname);
        this.course = course;
//        this(5);
        System.out.println("Hello");
    }

    public Student2(int i) {
        super("Petya");

    }

    public static void main(String[] args) {
        Student2 s = new Student2("Kolya", "Ivanov",3);
        System.out.println(s.name);
        System.out.println(s.surname);
        System.out.println(s.course);

    }
}
