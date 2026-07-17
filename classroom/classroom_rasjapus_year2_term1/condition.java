package classroom_rasjapus_year2_term1;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรอกน้ำหนัก : "); double w = sc.nextDouble();
        System.out.print("กรอกส่วนสูง : "); double h = sc.nextDouble();

        double h_m = h/100.0 ;
        double bmi = w / (h_m * h_m);
        System.out.printf("ค่า BMI ของคุณคือ : %.2f\n", bmi);

        if(bmi < 18.5){
            System.out.println("คุณอยู่ในเกณฑ์น้ำหนักน้อย");
        } else if(bmi >= 18.5 && bmi < 25){
            System.out.println("คุณอยู่ในเกณฑ์ปกติ");
        } else if(bmi >= 25 && bmi < 30){
            System.out.println("คุณอยู่ในเกณฑ์น้ำหนักเกิน");
        } else {
            System.out.println("คุณอยู่ในเกณฑ์อ้วน");
        }
    }
}
