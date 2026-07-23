package classroom_rasjapus_year2_term1;

public class book {
    String title;
    int price;
}

class bookTest {
    public static void main(String[] args) {
        book book1 = new book();
        book1.title = "Java Programming";
        book1.price = 599;

        System.out.println("Title: " + book1.title);
        System.out.println("Price: " + book1.price);
    }
}
