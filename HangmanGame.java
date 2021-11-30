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
