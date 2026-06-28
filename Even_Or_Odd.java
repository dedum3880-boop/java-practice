
import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("กรอกตัวเลข : "); int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println( number +" เป็นเลขคู่");
        }else {
            System.out.println(number + " เลขคี่");
        }
    }
}