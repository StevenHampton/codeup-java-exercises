package bookstore;

public class Author extends Person {
    public int books;

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }

    public Author(String author, int books){
        super(author);
        this.books = books;
    }
}
