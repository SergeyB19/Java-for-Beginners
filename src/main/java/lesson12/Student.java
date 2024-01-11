package lesson12;

import java.util.Objects;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student() {
    }

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, grade);
    }

    public static void swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }

    public static void changeName(Student s1) {
        s1.name = "Vasiliy";
    }

    public void equalsStudent(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    public void equalsStudentAtrubute(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена студентов, курсы и оценки одинаковые");
                } else if (((st1.name == st2.name) && (st1.course == st2.course)) || (st1.grade != st2.grade)) {
                    System.out.println("Имена студентов и курсы одинаковые, но оценки различаются");
                } else if ((st1.name == st2.name) || (st1.course != st2.course)) {
                    System.out.println("Имена студентов одинаковые, но курсы различаются");
                } else {
                    System.out.println("Имена студентов различаются");
                }
                }
            }
        }



public static void main(String[] args) {
    Student student = new Student();
    Student st1 = new Student("Ivan", 3, 9.5);
    Student st3 = new Student("Ivan", 3, 9.5);
    Student st4 = new Student("neIvan", 5, 9.2);
    Student st2 = new Student("Petr", 3, 5.3);
    student.equalsStudent(st1, st2);
    student.equalsStudentAtrubute(st1, st4);

//        changeName(st2);
//        System.out.println(st2.name);


}
}
