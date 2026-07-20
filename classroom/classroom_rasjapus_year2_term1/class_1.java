package classroom_rasjapus_year2_term1;

import java.util.Scanner;

public class class_1 {
    public static void main(String[] args) {    
        CalculateClass cc = new CalculateClass();
        cc.Calculate(args);
    }
}
class CalculateClass {
    public void Calculate(String[] args) { 
        Scanner sr = new Scanner(System.in);
        int test1, test2, final_score, score = 0;
        char grade;

        System.out.print("กรุณากรอกคะแนนสอบครั้งที่ 1 : ");
        test1 = sr.nextInt();

        System.out.print("กรุณากรอกคะแนนสอบครั้งที่ 2 : ");
        test2 = sr.nextInt();    

        System.out.print("กรุณากรอกคะแนนสอบครั้งที่ final : ");
        final_score = sr.nextInt();

        score = test1 + test2 + final_score;

        if (score >= 80) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("เกรดของคุณคือ : " + grade);
        sr.close();
    }
}