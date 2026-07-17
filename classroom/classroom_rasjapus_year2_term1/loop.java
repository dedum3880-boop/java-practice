package classroom_rasjapus_year2_term1;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรอกจำนวนรอบ : ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0; int max = 0; int min = 0;
        double avg = 0.0;
        do{
            System.out.printf("รอบที่ %d\n", i); int s = sc.nextInt();
            sum += s;
            avg = (double) sum / n;

            if(i == 1) {
                max = s;
                min = s;
            } else {
                if(s > max) {
                    max = s;
                }
                if(s < min) {
                    min = s;
                }
            }

            i++;
        }while(i <= n);
        System.out.printf("ค่าเฉลี่ยของค่าที่กรอกคือ : %.2f\n", avg);
        System.out.printf("ค่ามากที่สุดคือ : %d\n", max);
        System.out.printf("ค่าน้อยที่สุดคือ : %d\n", min);
    }
}
