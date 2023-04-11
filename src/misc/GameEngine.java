package misc;

public class GameEngine {
    /**
     * Executes the game from start to end, including the game loop.
     */
    public static void runGame() {
        startGame();
        while (notGameGameOver()) {
            processInput();
            updateGame();
            renderGame();
        }
        endGame();
    }

    /**
     * Check if the game should keep still running.
     * @return true if the game is over, false otherwise
     */
    public static boolean notGameGameOver()
    {
        return true; // TODO implement this for real
    }

    /**
     * Reads and interprets input from the player and/or other sources.
     */
    private static void processInput() {
        return; // TODO implement this
    }

    /**
     * Incrementally updates the internal state of the game, including all game objects, by one frame.
     */
    private static void updateGame() {
        return; // TODO implement this
    }

    /**
     * Displays the next frame based on the current state of the game.
     */
    private static void renderGame() {
        return; // TODO implement this
    }

    /**
     * Initializes the state og the game, including all game objects.
     */
    public static void startGame() {
        return; // TODO implement this
    }

    /**
     * Cleans up all resources used by the game.
     */
    public static void endGame() {
        return; // TODO implement this
    }

    /**
     * Simple procedure to test the running of the game loop.
     * @param args command-line arguments to this test program (not currently used)
     */
    public static void main(String[] args) {
        runGame();
    }
}
