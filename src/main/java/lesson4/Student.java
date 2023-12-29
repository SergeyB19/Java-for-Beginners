package lesson4;

public class Student {
    int numberOfTicket;
    String name;
    String surname;
    int yearOfStudy;
    double mathGrade;
    double economicsGrade;
    double foreignLanguageGrade;

}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.numberOfTicket = 1;
        student1.name = "Ivan";
        student1.surname = "Ivanov";
        student1.yearOfStudy = 2005;
        student1.mathGrade = 4;
        student1.economicsGrade = 5;
        student1.foreignLanguageGrade = 7;

        student2.numberOfTicket = 2;
        student2.name = "Petr";
        student2.surname = "Petrov";
        student2.yearOfStudy = 2006;
        student2.mathGrade = 5;
        student2.economicsGrade = 3;
        student2.foreignLanguageGrade = 2;

        student3.numberOfTicket = 3;
        student3.name = "Sidr";
        student3.surname = "Sidorov";
        student3.yearOfStudy = 2007;
        student3.mathGrade = 7;
        student3.economicsGrade = 9;
        student3.foreignLanguageGrade = 1;

        System.out.println("Имя "+student1.name + " Фамилия " + student1.surname + " Cредняя оценка " + ((student1.mathGrade+student1.economicsGrade+student1.foreignLanguageGrade)/3));
        System.out.println("Имя "+student2.name + " Фамилия " + student2.surname + " Cредняя оценка " + ((student2.mathGrade+student2.economicsGrade+student2.foreignLanguageGrade)/3));
        System.out.println("Имя "+student3.name + " Фамилия " + student3.surname + " Cредняя оценка " + ((student3.mathGrade+student3.economicsGrade+student3.foreignLanguageGrade)/3));
    }
    }

