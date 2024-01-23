package lesson23.p1;

import lesson23.Human;

public class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}