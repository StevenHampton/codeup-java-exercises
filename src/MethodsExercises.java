import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What arithmetic would you like to use?");
        System.out.print("(add, subtract, multiply, divide)");
        String arith = scan.nextLine();
        switch (arith) {
            case "add": {
                System.out.println("What number do you want to start with?");
                int num1 = scan.nextInt();
                System.out.println("What do you want to  " + arith + " to " + num1 + "?");
                int num2 = scan.nextInt();
                System.out.println(addition(num1, num2));
                break;
            }
            case "subtract": {
                System.out.println("What number do you want to start with?");
                int num1 = scan.nextInt();
                System.out.println("What do you want to  " + arith + " from " + num1 + "?");
                int num2 = scan.nextInt();
                System.out.println(subtraction(num1, num2));
                break;
            }
            case "multiply": {
                System.out.println("What number do you want to start with?");
                int num1 = scan.nextInt();
                System.out.println("What do you want to  " + arith + " " + num1 + " by?");
                int num2 = scan.nextInt();
                System.out.println(multiplication(num1, num2));
                break;
            }
            case "divide": {
                System.out.println("What number do you want to start with?");
                int num1 = scan.nextInt();
                System.out.println("What do you want to  " + arith + " " + num1 + " by?");
                int num2 = scan.nextInt();
                System.out.println(division(num1, num2));
                break;
            }
            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println(getInteger(1, 10));
        System.out.print("Enter a number to find a factorial for it: ");
        int number = scan.nextInt();
        int fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
        System.out.print("Enter how many sides you want on the dice: ");
        int side = scan.nextInt();
        System.out.println(diceRoll(side));
    }

    private static String addition(int num1, int num2) {
        int sum = num1 + num2;
        return (num1 + " + " + num2 + " = " + sum);
    }

    private static String subtraction(int num1, int num2) {
        int dif = num1 - num2;
        return (num1 + " - " + num2 + " = " + dif);
    }

    private static String multiplication(int num1, int num2) {
        int product = num1 * num2;
        return (num1 + " * " + num2 + " = " + product);
    }

    private static String division(int num1, int num2) {
        int qot = num1 / num2;
        return (num1 + " / " + num2 + " = " + qot);
    }

    private static String getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput = scan.nextInt();
        String pass = "This is valid";
        if (userInput >= min && userInput <= max) {
            return pass;
        }
        System.out.println("This number is invalid");
        return getInteger(1, 10);
    }

    private static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    private static String diceRoll(int sides) {
        long total;
        long roll1 = random(sides);
        long roll2 = random(sides);
        total = roll1 + roll2;
        return "Your first roll was " + roll1 + ", your second roll was " + roll2 + ", for a total of " + total;
    }

    private static long random(int num) {
        return (int) (Math.random() * num) + 1;
    }
}
