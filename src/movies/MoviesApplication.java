package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        String category = null;
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        if (choice == 0){
            return;
        }
        if (choice == 1){
            category = "All Movies";
        }
        if (choice == 2){
            category = "animated";
        }
        if (choice == 3){
            category = "drama";
        }
        if (choice == 4){
            category = "horror";
        }
        if (choice == 5){
            category = "scifi";
        }
        System.out.println(category);

    }
}
