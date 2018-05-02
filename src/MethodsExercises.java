import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What arithmetic would you like to use?");
        System.out.print("(add, subtract, multiply, divide)");
        String arith = scan.nextLine();
        if(arith.equals("add")){
            System.out.println("What number do you want to start with?");
            int num1 = scan.nextInt();
            System.out.println("What do you want to  " + arith + " to " + num1 + "?");
            int num2 = scan.nextInt();
            System.out.println(addition(num1, num2));
        }
        else if(arith.equals("subtract")){
            System.out.println("What number do you want to start with?");
            int num1 = scan.nextInt();
            System.out.println("What do you want to  " + arith + " from " + num1 + "?");
            int num2 = scan.nextInt();
            System.out.println(subtraction(num1, num2));
        }
        else if(arith.equals("multiply")){
            System.out.println("What number do you want to start with?");
            int num1 = scan.nextInt();
            System.out.println("What do you want to  " + arith + " " + num1 + " by?");
            int num2 = scan.nextInt();
            System.out.println(multiplication(num1, num2));
        }
        else if(arith.equals("divide")){
            System.out.println("What number do you want to start with?");
            int num1 = scan.nextInt();
            System.out.println("What do you want to  " + arith + " " + num1 + " by?");
            int num2 = scan.nextInt();
            System.out.println(division(num1, num2));
        }
        else{
            System.out.println("Invalid");
        }
    }
    public static String addition(int num1, int num2){
        int sum = num1 + num2;
        return (num1 + " + " + num2 + " = " + sum);
    }
    public static String subtraction(int num1, int num2){
        int dif = num1 - num2;
        return (num1 + " - " + num2 + " = " + dif);
    }
    public static String multiplication(int num1, int num2){
        int product = num1 * num2;
        return (num1 + " * " + num2 + " = " + product);
    }
    public static String division(int num1, int num2){
        int qot = num1 / num2;
        return (num1 + " / " + num2 + " = " + qot);
    }
}
