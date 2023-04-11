package cards;

public class DeckOfCardsRevised {
    public static final String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    public static final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};

    /**
     * A program that will pick four cards at random from a deck of 52 cards.
     */
    public static void main(String[] args) {
        int[] deck = newDeck();
        shuffleDeck(deck);
        revealTopCards(deck, 4);
    }

    /**
     * Initializes a new, standard 52-card deck.
     *
     * @return an array holding the new cards
     */
    public static int[] newDeck() {
        int[] deck = new int[52];

        // Initialize the cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        return deck;
    }

    /**
     * Shuffles the {@code deck} with a simple, uniformly random distribution.
     *
     * @param deck an array of cards
     */
    public static void shuffleDeck(int[] deck) {
        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            //Generate an index randomly
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    /**
     * Shows the first {@code count} cards from the given {@code deck}.
     *
     * @param deck  an array of cards
     * @param count how many cards to reveal from the top of the deck
     */
    public static void revealTopCards(int[] deck, int count) {
        //Display the first four cards
        for (int i = 0; i < count; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}
