    package classroom_rasjapus_year2_term1;

    public class Student {
        private String id;
        private String name;
        private String Section;
        private String project_name;
        private String borrow_date;

        public Student(String id, String name, String Section, String project_name, String borrow_date) {
            this.id = id;
            this.name = name;
            this.Section = Section;
            this.project_name = project_name;
            this.borrow_date = borrow_date;
        }

        public void borrowProject(String project_name, String borrow_date) {
            this.project_name = project_name;
            this.borrow_date = borrow_date;
        }

        public void showProject() {
            System.out.println("----------------------------------------");
            System.out.println("รหัสนักศึกษา  : " + this.id);
            System.out.println("ชื่อ-นามสกุล  : " + this.name);
            System.out.println("หมู่เรียน     : " + this.Section);
            System.out.println("ภาคนิพนธ์    : " + this.project_name);
            System.out.println("วันที่ยืม      : " + this.borrow_date);
            System.out.println("----------------------------------------");
        }

        public static void main(String[] args) {
            Student std = new Student("68143537", "kidsadar keatikeaw", "2", "Project A", "2024-01-15");
            std.showProject();
        }
    }