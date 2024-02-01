package lesson30;

import java.util.ArrayList;

public class Test2 {
}

/*class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(lesson30.Student student) {
        System.out.println("Имя студента: " + student.name + ", пол: " + student.sex + ", возраст: " + student.age +
                ", курс " + student.course + ", средняя оценка " + student.avgGrade);
    }


    public static void main(String[] args) {
        ArrayList<lesson30.Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();
        *//*FindStudentsOverGrade fsog = new FindStudentsOverGrade();
        si.testStudents(list, fsog);*//*


        FindStudentUnderAge findStudentUnderAge = new FindStudentUnderAge();
        FindStudentOverAge findStudentOverAge = new FindStudentOverAge();
        FindStudentsOverGrade findStudentsOverGrade = new FindStudentsOverGrade();
        FindStudentUnderGrade findStudentUnderGrade = new FindStudentUnderGrade();
        FindStudentBySex findStudentBySex = new FindStudentBySex();
        FindStudentMixCondition findStudentMixCondition = new FindStudentMixCondition();
        System.out.println("findStudentUnderGrade");
        si.testStudents(list, findStudentUnderGrade);
        System.out.println("findStudentsOverGrade");
        si.testStudents(list, findStudentsOverGrade);
        System.out.println("findStudentUnderAge");
        si.testStudents(list, findStudentUnderAge);
        System.out.println("findStudentOverAge");
        si.testStudents(list, findStudentOverAge);
        System.out.println("findStudentBySex");
        si.testStudents(list, findStudentBySex);
        System.out.println("findStudentMixCondition");
        si.testStudents(list, findStudentMixCondition);


    }

    void testStudents(ArrayList<Student> aL, StudentChecks sc) {
        for (Student s : aL) {
            if (sc.testStudent(s)) {
                printStudent(s);
            }
        }
    }
}

interface StudentChecks {
    boolean testStudent(Student s);
}

class FindStudentsOverGrade implements StudentChecks {
    @Override
    public boolean testStudent(Student s) {
        return s.avgGrade > 8.5;
    }
}

class FindStudentUnderGrade implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.avgGrade < 9;
    }
}

class FindStudentOverAge implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.age > 25;
    }
}

class FindStudentUnderAge implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.age < 27;
    }
}

class FindStudentBySex implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.sex == 'm';
    }
}

class FindStudentMixCondition implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f';
    }
}*/



