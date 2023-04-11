package cards;

public class DeckOfCards {
    public static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    public static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};

    /**
     * A program that will pick four cards at random from a deck of 52 cards.
     */
    // <access-specifier> <storage-class> <return-type> <function-name> ( <param-type> <param-name> )
    public static void main(String[] args) {
        // Initialize the cards - make this a method
        // this method should create NEW ARRAY (return value)
        // and fill it with integer values for each card
        int[] deck = newDeck();
        // Shuffle the cards - make this a method
        // this method should take a DECK (parameter)
        // and randomly shuffle its elements
        shuffleDeck(deck);
        // Display the first four cards - make this a method
        // take a DECK (parameter) and get the first four cards
        // then display each one to the user
        showTopCards(deck, 4);
    }

    public static void showTopCards(int[] deck, int count) {
        for (int i = 0; i < count; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": "
                    + rank + " of " + suit);
        }
    }
    public static void shuffleDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            //Generate an index randomly
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public static int[] newDeck() {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;
        return deck;
    }
}