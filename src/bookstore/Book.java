package bookstore;

public class Book extends Product {
    public Book(String title, int price, String Author) {
        super(title, price);
        new Author(Author, 1);
    }
}
