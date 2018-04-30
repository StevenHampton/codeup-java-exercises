import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in a number: ");
        Integer myInt = sc.nextInt();
        System.out.println("Your entered: " + myInt);
        System.out.println("==================");
        System.out.print("Enter in three words: ");
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println("==================");
        sc.nextLine();
        System.out.print("Enter a sentence: ");
        String mySentence = sc.nextLine();
        System.out.println("You entered: " + mySentence);
        System.out.println("==================");
        System.out.print("Enter the class length and width: ");
        String length = sc.next();
        String width = sc.next();
        System.out.println("length: " + length + " width: " + width);
    }
}
