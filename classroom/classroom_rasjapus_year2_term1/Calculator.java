package classroom_rasjapus_year2_term1;

public class Calculator {
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void  subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void divide(int a, int b) {
        System.out.println("Division: " + (a / b));

    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5, 3);
        calc.subtract(10, 4);
        calc.multiply(6, 7);
        calc.divide(20, 5);
    }
}