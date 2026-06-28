package array;

public class array_for_loop {
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        String[] names = {"Big Boss", "Alice", "Bob"};

        for(int i=0; i<=4; i++){
            System.out.println(number[i]);
        }

        for(int i=0; i<=2; i++){
            System.out.println(names[i]);
        }
    }
}
