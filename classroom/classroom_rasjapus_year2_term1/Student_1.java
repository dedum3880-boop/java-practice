package classroom_rasjapus_year2_term1;

public class Student_1 {
        private String id;
        private String name;
        private String major;
        private int gpa;

    public Student_1(String id, String name, String major, int gpa) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public class ShowStudent {
        public void displayStudentInfo() {
            System.out.println("Student ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Major: " + major);
            System.out.println("GPA: " + gpa);
        }
    }

    public static void main(String[] args) {
        Student_1 student = new Student_1("S001", "John Doe", "Computer Science", 3);
        ShowStudent showStudent = student.new ShowStudent();
        showStudent.displayStudentInfo();
    }

}

