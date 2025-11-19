public class PlayGame {
    
    public static void main(String[] args) {
        new PlayGame().runGame();
    }

    public void runGame() {
        String secretWord = "ROBOT"; 
        CheckGuess checker = new CheckGuess(secretWord);
        UpdateRows state = new UpdateRows();
        DisplayGame display = new DisplayGame();

        System.out.println("Guess the 5 letter word:");
        while (!state.isGameOver()) {
            display.printBoard(state);
            String guess = display.getInput(checker);
            LetterStatus[] feedback = checker.check(guess);
            state.addGuess(guess, feedback);
            state.checkWin(feedback);
        }
        display.printBoard(state); 
        String finalSecretWord = secretWord; 
        if (!state.getGameWon()) {
            System.out.println("\n Game Over. The word was: " + finalSecretWord);
        } else {
            System.out.println("\n Congratulations! You guessed the word in " + (6 - state.getGuessesRemaining()) + " tries!");
        }
    }
}
