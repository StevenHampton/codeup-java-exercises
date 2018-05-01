import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What do you want to say to Bob? ");
        String talk = scan.nextLine();

        if(talk.endsWith("?")){
            System.out.println("Sure.");
        }
        else if(talk.toUpperCase().equals(talk) && !talk.isEmpty()){
            System.out.println("Whoa, chill out!");
        }
        else if(talk.isEmpty()){
            System.out.println("Fine. Be that way!");
        }
        else{
            System.out.println("Whatever.");
        }
    }
}
