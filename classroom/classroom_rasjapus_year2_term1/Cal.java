package classroom_rasjapus_year2_term1;

public class Cal {
    public static void main(String[] args) {

        Calculate c = new Calculate();

        c.add(10, 20);
        c.subtract(10, 20);
        c.multiply(10, 20);
        c.divide(10, 20);
    }
}

class Calculate {

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("ผลบวกของ " + a + " และ " + b + " คือ : " + sum);
    }

    public void subtract(int a, int b) {
        int sum = a - b;
        System.out.println("ผลลบของ " + a + " และ " + b + " คือ : " + sum);
    }

    public void multiply(int a, int b) {
        int sum = a * b;
        System.out.println("ผลคูณของ " + a + " และ " + b + " คือ : " + sum);
    }

    public void divide(int a, int b) {

        if (b == 0) {
            System.out.println("ไม่สามารถหารด้วย 0 ได้");
            return;
        }

        double result = (double) a / b;
        System.out.println("ผลหารของ " + a + " และ " + b + " คือ : " + result);
    }
}