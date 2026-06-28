import java.util.Scanner;

public class While_for {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("กรอกตัวเลข : "); int n = sc.nextInt();

        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
