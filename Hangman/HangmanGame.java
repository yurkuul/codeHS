public class HangmanGame {
    //possible words for computer to randomly choose from
    private static final String possibleWords[] = {"hunger", "cat", "dog", "kite", "zipper", "marsh", "total", "soccer"};
    //Maximum number of guesses
    private final static int NUM_OF_GUESSES = 5; 
    //Number of letters in the word as requested by user
    private int numOfLetters;
    //Number of guesses left
    private int guessesLeft;
    //Number of letters correctly guessed
    private int numCorrectLetters;
    //Secret word
    private String word;
    //Holds onto the secret word in char array form
    private char[] wordArray;
    //Holds onto the guesses in char array form
    private char[] guessArray;
    //Holds onto all the guesses made
    private char[] possibleCharacters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    //Holds onto all the guesses guessed
    private char[] allGuesses;
    //Holds onto all the guesses guessed as a String
    String allTheGuesses = "";
    
    /**
     *  This should take 1 parameter - the amount of letters that the secret word should be.
        Set it so that the numOfLetters holds onto the amount of letters in the secret word, guessesLeft starts at the maximum amount of guesses, and the numCorrectLetters starts at 0.
        word will be empty for now, and wordArray and guessArray should be initialized to the size that the word will be.
     *  @param - int numOfLetters - The number of letters that the secret word will be
     *  
    */
    public HangmanGame(int lengthOfSecretWord) {
        numOfLetters = lengthOfSecretWord;
        guessesLeft = NUM_OF_GUESSES;
        numCorrectLetters = 0;
        wordArray = new char [numOfLetters];
        guessArray = new char [numOfLetters];
        allGuesses = new char[27];
    }
    
    /**
     *  Constructor for project testing
     *  This should take 1 parameter - the secret word (so that you can make a game that's easy to test!)
        Set it so that the numOfLetters holds onto the amount of letters in the secret word, guessesLeft starts at the maximum amount of guesses, and the numCorrectLetters starts at 0.
        word should be set to the secret word, and wordArray and guessArray should be initialized to the size of that word
     * 
     *  @param - int numOfLetters - The number of letters that the secret word will be
     *  
    */
    public HangmanGame(String secretWord) {
        numOfLetters = secretWord.length();
        guessesLeft = NUM_OF_GUESSES;
        numCorrectLetters = 0;
        word = secretWord;
        wordArray = new char [numOfLetters];
        guessArray = new char [numOfLetters];
        allGuesses = new char[27];
    }
    
    /**
    * Generates a random word and puts it into a char array
    * 
    */
    public void setup()
    {
        chooseWord();
        createArrays();
    }
    
    /**
    *   Pick a random word from the possibleWords list that is 
    *   numOfLetters long.
    * 
    */
    private void chooseWord() {
        String[] availWords = new String[3];
        String currWord;
        for (int i = 0; i < possibleWords.length; i++) {
            currWord = possibleWords[i];
            if (currWord.length() == numOfLetters) {
                if (availWords[0] == null) {
                    availWords[0] = possibleWords[i];
                } else if (availWords[1] == null) {
                    availWords[1] = possibleWords[i];
                } else {
                    availWords[2] = possibleWords[i];
                }
            }
        }
        int index = (int) (Math.random() * (2+1) + 1);
        word = availWords[index-1];
        while (word == null) {
            index = (int) (Math.random() * (2+1) + 1);
            word = availWords[index-1];
        }
        //System.out.println (word);
    }
    
    /**
    *  Sets up 2 arrays:
    *   guessArray - fills it full of * characters
    *   wordArray - fills it with the word that was randomly selected
    *  
    */
    private void createArrays() {
        for (int i = 0; i < guessArray.length; i++) {
            guessArray[i] = '*';
            //System.out.println (guessArray[i]);
        }
        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = word.charAt(i);
            //System.out.println (wordArray[i]);
        }
    }
    
    /**
    *   Shares how many guesses left
    * 
    *   @return - the amount of guesses left for this game
    * 
    */
    public int getGuessesLeft() {
        return guessesLeft;
    }
    
    /**
    *  Shares how many guesses left
    *  @return - the amount of correct letters the player has left
    * 
    */
    public int getCorrectLetters() {
        return numCorrectLetters;
    }
    
    /**
    *   Prints out the "board" with any correct guesses printed out
    *   
    */
    public void printBoard() {
        for (int i = 0; i < word.length(); i++) {
            System.out.print ("[" + guessArray[i] + "]");
        }
    }
    
    /**
     *  Prints out the answer (FOR TESTING PURPOSES ONLY!)
     *  
     */
    public void printSecretWord() {
        System.out.println (word);
    }
    
    /**
    *   Decides if the game is finished or not.
    * 
    */
    public boolean gameOver() {
        if ((guessesLeft == 0) || (hasWon())) {
            return true;
        }
        return false;
    }
    
    /**
    *   Decides if the person won or lost the game
    * 
    *   @return - true if the user has won, false if they have not won
    * 
    */
    public boolean hasWon() {
        if (numCorrectLetters == numOfLetters) {
            return true;
        }
        return false;
    }
    
    /**
    *   Checks to see if the guess was a correct guess.
    *   Updates the guess array, number of correct letters, and guesses left accordingly
    * 
    *   @param - user letter guess
    *   @return - true if the user guessed correctly, false if they guessed incorrectly
    *   
    */
    public boolean checkGuess(char guess) {
        int preCorrectLetters = numCorrectLetters;
        String theGuess = Character.toString(guess);
        for (int i = 0; i < word.length(); i++) {
            if (wordArray[i] == (guess)) {
                numCorrectLetters++;
                guessArray [i] = guess;
            }
        }
        for (int i = 0; i < possibleCharacters.length; i++) {
            if (possibleCharacters[i] == guess) {
                possibleCharacters[i] = '0';
            }
        }
        for (int i = 0; i < allGuesses.length; i++) {
            if (allGuesses[i] != '0') {
                allGuesses[i] = guess;
                break;
            }
        }
        if (numCorrectLetters > preCorrectLetters) {
            return true;
        }
        guessesLeft--;
        return false;
    }
    
    /**
     * Returns the hangman ASCII art
     * 
     * @return - string of the hangman ASCII art
     * 
     */
    public String printHangman () {
        String theHangman = "";
        switch (guessesLeft) {
            case 0: 
                theHangman = "    ____________\n" + 
                            "     |/      |\n" + 
                            "     |      (_)\n" + 
                            "     |      \\|/\n" + 
                            "     |       |\n" + 
                            "     |      / \\\n" + 
                            "     |\n" + 
                            "    _|___";
                break;
            case 1: 
                theHangman = "    ____________\n" + 
                            "     |/      |\n" + 
                            "     |      (_)\n" +  
                            "     |      \\|/\n" + 
                            "     |       |\n" + 
                            "     |        \\\n" + 
                            "     |\n" + 
                            "    _|___";
                break;
            case 2:
                theHangman = "    ____________\n" + 
                            "     |/      |\n" + 
                            "     |      (_)\n" +  
                            "     |      \\|/\n" + 
                            "     |       |\n" + 
                            "     |\n" + 
                            "     |\n" + 
                            "    _|___";
                break;
            case 3:
                theHangman = "    ____________\n" + 
                            "     |/      |\n" + 
                            "     |      (_)\n" +  
                            "     |      \\|/\n" + 
                            "     |\n" + 
                            "     |\n" + 
                            "     |\n" + 
                            "    _|___";
                break;
            case 4:
                theHangman = "    ____________\n" + 
                            "     |/      |\n" + 
                            "     |      (_)\n" +  
                            "     |\n" + 
                            "     |\n" + 
                            "     |\n" + 
                            "     |\n" + 
                            "    _|___";
                break;
            case 5:
                theHangman = "    ____________\n" + 
                            "     |/\n" + 
                            "     |\n" + 
                            "     |\n" + 
                            "     |\n" + 
                            "     |\n" + 
                            "     |\n" + 
                            "    _|___";
                break;
        }
        return theHangman;
    }
    
    /**
     * Checks to see if the letter inputted as been guessed already
     * 
     * @return true if the letter has been guessed already, false if the letter hasn't been guessed yet
     */
    public boolean checkLetter(char letter) {
        for (int i = 0; i < possibleCharacters.length; i++) {
            if (letter == possibleCharacters[i]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Returns all the guesses guessed
     * 
     * @return String of all the guesses
     */
    public String printGuesses() {
        for (int i = 0; i < allGuesses.length; i++) {
            if (allGuesses[i] != '0') {
                allTheGuesses += allGuesses[i] + ", ";
                break;
            }
        }
        return allTheGuesses;
    }
}
