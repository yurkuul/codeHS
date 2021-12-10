import java.util.Scanner;

public class PlayHangman
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        //Ask the user to enter a number between 3 and 6
        System.out.println ("How many letters long would you like the word to be? (Must be between 3 and 6):");
        int numLetters = s.nextInt();
        //If their number is not between 3 and 6, please ask them to try again
        while (numLetters > 6 || numLetters < 3) {
            System.out.println ("I'm sorry, the number must be between 3 and 6.");
            System.out.println();
            System.out.println ("How many letters long would you like the word to be? (Must be between 3 and 6):");
            numLetters = s.nextInt();
        }
        //Buffer
        s.nextLine();
        //Once they give the correct amount of numbers, you can create a new game
        HangmanGame game = new HangmanGame (numLetters);
        //Once you've created a new game, don't forget to call the "setup" method!
        //This will set up your word in an array for you, as well as your guess array
        game.setup();
        //Print out the current board
        System.out.println();
        System.out.println ("Current board:");
        game.printBoard();
        System.out.println();
        System.out.println (game.printHangman());
        System.out.println();
        //Ask the users for a guess
        System.out.println ("What is your guess? You have " + game.getGuessesLeft() + " left.");
        String letter = s.nextLine();
        char guess = letter.charAt(0);
        while (game.getGuessesLeft() != 0) {
            //If the guess is correct, print out info saying that they received a correct
            //guess, as well as how many numbers they have correctly guessed this game 
            //so far
            if (game.checkLetter(guess)) {
                System.out.println ("You have already guessed that letter!");
                System.out.println();
                System.out.println ("Your guesses so far: " + game.printGuesses());
                System.out.println();
                System.out.println ("What is your guess? You have " + game.getGuessesLeft() + " left.");
                letter = s.nextLine();
                guess = letter.charAt(0);
            } else if (game.checkGuess(guess)) {
                System.out.println ("Your guess was correct! You have guessed " + game.getCorrectLetters() + " letter(s) correctly.");
                System.out.println();
                System.out.println ("Current board:");
                game.printBoard();
                System.out.println();
                System.out.println (game.printHangman());
                System.out.println();
                System.out.println ("Guess History: " + game.printGuesses());
                System.out.println();
                if (game.hasWon()) {
                    System.out.println ("Congrats! You have won the game.");
                    break;
                } else if (game.gameOver()) {
                    System.out.println ("You ran out of guesses!");
                    System.out.println ("The correct answer is: ");
                    game.printSecretWord();
                    break;
                }
                System.out.println ("What is your guess? You have " + game.getGuessesLeft() + " left.");
                letter = s.nextLine();
                guess = letter.charAt(0);
            } else {
                //If they're not correct, state that their guess is not correct
                //Keep asking them for guesses until either they have guessed all the letters 
                //or run out of guesses
                System.out.println ("I'm sorry! Your guess was not correct.");
                System.out.println();
                System.out.println ("Current board:");
                game.printBoard();
                System.out.println();
                System.out.println (game.printHangman());
                System.out.println();
                System.out.println ("Guess History: " + game.printGuesses());
                System.out.println();
                if (game.hasWon()) {
                    System.out.println ("Congrats! You have won the game.");
                    break;
                } else if (game.gameOver()) {
                    System.out.println ("You ran out of guesses!");
                    System.out.println ("The correct answer is: ");
                    game.printSecretWord();
                    break;
                }
                System.out.println ("What is your guess? You have " + game.getGuessesLeft() + " left.");
                letter = s.nextLine();
                guess = letter.charAt(0);
            }
        }
    }
}
