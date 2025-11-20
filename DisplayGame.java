import java.util.Scanner;
public class DisplayGame{
  public void printBoard(){
    println(guesses)
  }
  public String getInput(){} 
}

public class DisplayGame {
    private final Scanner scanner;
    public DisplayGame() {
        this.scanner = new Scanner(System.in);
    }
    public void printBoard(UpdateRows state) {
        private void printBoard(){;}
        String[] pastGuesses = state.getGuesses();
        LetterStatus[][] feedback = state.getFeedback();
        
        System.out.println("\n===== WORDLE GAME =====");
        for (int i = 0; i < 6; i++) {
            if (i < state.getGuessCount()) {
                System.out.print("Guess " + (i + 1) + ": ");
                for (int j = 0; j < 5; j++) {
                    char letter = pastGuesses[i].charAt(j);
                    System.out.print("[" + letter + "/" + feedback[i][j].name().charAt(0) + "] ");
                }
            } else {
                // Display empty slots
                System.out.print("Guess " + (i + 1) + ": ");
                System.out.print("[ ] [ ] [ ] [ ] [ ] "); // 5 empty spaces
            }
            System.out.println();
        }
        System.out.println("=======================");
        
    }

    public String getInput(CheckGuess checker) {
        String guess;
        boolean isValid = false;
        
        while (!isValid) {
            System.out.print("\nEnter your 5-letter guess: ");
            // Use the initialized Scanner
            guess = scanner.nextLine().trim(); 

            // Assuming CheckGuess has a public method isValidGuess(String input)
            if (checker.isValidGuess(guess)) {
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter a 5-letter word.");
            }
            
        } ;

        return guess;
    }
}
