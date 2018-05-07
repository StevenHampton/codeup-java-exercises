import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
    String part1 = picker(nouns);
    String part2 = picker(adj);
        System.out.println(part1 + "-" + part2);
    }
    private static String[] nouns = {"Large", "Small", "Gigantic", "Smelly", "Pretty", "Crazy", "Hungry", "Angry", "Nice", "Pleasant"};
    private static String[] adj = {"Bill", "Cat", "House", "Turnip", "Luis", "Grandpa", "Weasel", "Power Ranger", "Ghost", "Towel"};
    public static String picker(String[] arr){
        Random num = new Random();
        int i = num.nextInt(9) + 1;
        return arr[i];
    }
}
