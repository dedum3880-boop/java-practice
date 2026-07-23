package classroom_rasjapus_year2_term1;

public class Car {
    String brand;
    String model;
    int year;
}

class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        System.out.println("Brand: " + car1.brand);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
    }
}