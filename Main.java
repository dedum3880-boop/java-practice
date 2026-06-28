import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("กรอกชื่อ : ");
        String name = sc.nextLine();

        System.out.println("กรอกอายุ : ");
        int age = sc.nextInt();

        System.out.println("สวัสดี" + name);
        System.out.println("คุณอายุ" + age);

        if (age >= 18) {
            System.out.println("ผู้ใหญ่");
        }else {
            System.out.println("เด็ก");
        }
    }
}