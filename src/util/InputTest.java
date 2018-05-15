package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input(); // instantiate an object / create an object
        System.out.println("Enter an Number");
        double anyNumber = input.getDouble(2.5, 10.7);
        System.out.println(anyNumber);
    }
}