package bookstore;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter in first author: ");
        String name = scan.nextLine();
        System.out.print("How many books has he written? ");
        int books = scan.nextInt();
        String author1 = new Author(name, books);
        System.out.println();
    }
}
