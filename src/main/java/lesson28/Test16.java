package lesson28;

import lesson10hw.p4.D;

import javax.print.Doc;
import java.util.ArrayList;

public class Test16 {
    //    static ArrayList<String> list;
    static Doctor[] array;
    public static void main(String[] args) {
      /*  ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.get(3));*/
//        System.out.println(5/0);
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Teacher t3 = new Teacher();
        Teacher[] array2 = {t, t3};
        Employee[] array1 = {d, t};
//        Teacher t2 = (Teacher) array1[0];
//        Doctor d2 = (Doctor) array2[0];
//        createPwd("qwe");
//        list.add("!!!");
//        System.out.println(array[0].toString());
        Integer.parseInt("44ab",16);
    }

    public static void createPwd(String pwd) {
        if (pwd.length() < 6) {
            throw new IllegalArgumentException("Dlina parolya slishkom malenkaya");
        }
        if (pwd.length() > 12) {
            throw new IllegalArgumentException("Dlina parolya slishkom bolshaya");
        }
        System.out.println("Parol prinyat");
    }
}

class Employee {

}

class Doctor extends Employee {

}

class Teacher extends Employee {

}

class Samolet {
    String sostoyanie = "v ojidanii";

    public void letet() {
        sostoyanie = "v vozduxe";
        System.out.println("Samolet letit");
    }

    public void ojidat() {
        if (sostoyanie.equals("v vozduxe")) {
            throw new IllegalStateException("Samolet uje v vozduxe");
        }
        sostoyanie = "v ojidanii";
        System.out.println("Samolet v ojidanii poleta");
    }

    public void otmenitPolet() {
        if (sostoyanie.equals("v vozduxe")) {
            throw new IllegalStateException("Samolet uje v vozduxe");
        }
        sostoyanie = "polet otmenen";
        System.out.println("Polet samoleta otmenen");
    }

    public static void main(String[] args) {
        Samolet s = new Samolet();
        s.ojidat();
        s.letet();
        s.otmenitPolet();
    }
}

