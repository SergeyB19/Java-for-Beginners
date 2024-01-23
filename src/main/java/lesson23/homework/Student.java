package lesson23.homework;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name); /*return copy of name*/
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("Имя студента: " + getName());
        System.out.println("Курс: " + getCourse());
        System.out.println("Оценка: " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student st = new Student();
        StringBuilder sb1 = new StringBuilder("Kung-Lao");
        st.setName(sb1);
        st.setCourse(4);
        st.setGrade(10);
        st.showInfo();

    }
}