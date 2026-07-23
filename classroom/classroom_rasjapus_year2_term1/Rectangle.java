package classroom_rasjapus_year2_term1;

public class Rectangle {
     float width;
     float height;  

    public float getArea() {
        float result = width * height;
        
        System.out.println("Area: " + result);
        return result;
    }
}

class MainRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.width = 5.0f;
        rect1.height = 10.0f;

        rect1.getArea();
    }
}