package cardGames;

public class Card {
    private String suit;
    private String value;
    private int points;

    public Card(String value, String suit, int points) {
        this.value = value;
        this.suit = suit;
        this.points = points;
    }
}
