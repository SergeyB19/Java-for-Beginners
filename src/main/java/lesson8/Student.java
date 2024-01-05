package lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " is created");
    }

    public static void showCount() {
        System.out.println("Всего создано студентов " + count);
    }

    public void showInfo() {
        System.out.println("Welcome to the Student class!!!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student st2 = new Student("Petr", 1);
        st2.a++;
    }

    public static void main(String[] args) {
        abcd();
        Student st3 = new Student("Ivan", 4);
        st3.abc();
    }

}


class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);

        System.out.println(st1.name);
        System.out.println(Student.count);
        Student.showCount();
        st2.showCount();
    }
}
