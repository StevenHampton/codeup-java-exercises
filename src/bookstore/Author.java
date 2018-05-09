package bookstore;

public class Author extends Person {
    public int books;
    protected String author;

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public Author(String author, int books){
        super(author);
        this.books = books;
    }
}
