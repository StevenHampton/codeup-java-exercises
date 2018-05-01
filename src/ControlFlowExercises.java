import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int i = 5;
       while (i <= 15){
           System.out.print(i + " ");
           i++;
       }
        System.out.println("================");
        for(int num = 100; num >= 0; num -= 5){
            System.out.println(num);
        }
        System.out.println("================");
        for (float num2 = 2; num2 <= 1000000; num2 = (num2 * num2)){
            System.out.println(num2);
        }
        System.out.println("================");
        for (int y = 1; y <=100; y++){
            if(y % 3 == 0 && y % 5 != 0){
                System.out.print("Fizz, ");
            }
            else if(y % 3 == 0 && y % 5 == 0){
                System.out.print("FizzBuzz, ");
            }
            else if(y % 3 != 0 && y % 5 == 0){
                System.out.print("Buzz, ");
            }
            else{
                System.out.print(y + ", ");
            }
        }
        System.out.println();
        System.out.println("================");
        System.out.print("What number would you like to go up to? ");
        Integer upTo = scan.nextInt();
        System.out.println();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int num3 = 1; num3 <= upTo; num3++){
            System.out.println(num3 + "      | " + (num3 * num3) + "       | " + (num3 * num3 * num3) ) ;
        }
        System.out.print("Enter your grade percentage: ");
        Float grade = scan.nextFloat();
        if (grade >= 88){
            System.out.println("You have an A!");
        }
        else if(grade < 88 && grade >= 80){
            System.out.println("You have a B!");
        }
        else if(grade < 80 && grade >= 67){
            System.out.println("You have a C!");
        }
        else if(grade < 67 && grade >= 60){
            System.out.println("You have a D!");
        }
        else{
            System.out.println("You have a F");
        }
    }
}
