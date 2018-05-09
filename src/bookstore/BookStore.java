package bookstore;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter in first author: ");
        String name = scan.nextLine();
        System.out.print("How many books has he written? ");
        int books = scan.nextInt();
        System.out.println(new Person(name, books));
    }
}
