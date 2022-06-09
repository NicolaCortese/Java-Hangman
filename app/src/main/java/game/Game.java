package game;
import java.util.ArrayList;
import java.util.Scanner; 


class Game {
  public String answer;
  public ArrayList<Character> guessedLetters = new ArrayList<Character>();
  public Masker masker;
  public Integer attempts = 10;
  public Boolean endGame = false;
  public String name;

  public Game(WordChooser chooser, Masker masker, String name) {
    this.answer = chooser.getRandomWordFromDictionary();
    this.masker = masker; 
    this.name = name;
  }

  public void start(){
    System.out.println("---- Game Start ----");
    Scanner scanner = new Scanner(System.in);
    System.out.println(masker.getWordToGuess(this.answer, this.guessedLetters));
    
    while ( !endGame ) {
      System.out.println("You have " + getRemainingAttempts().toString() + " lives left. Enter your guess:");
      Character userInput = scanner.nextLine().charAt(0);
      guessLetter(userInput);
      System.out.println(masker.getWordToGuess(this.answer, this.guessedLetters));
      isGameLost();
      isGameWon(masker.getWordToGuess(this.answer, this.guessedLetters));
    }
  }

  public Integer getRemainingAttempts(){
    return this.attempts;
  }

  public Boolean guessLetter(Character letter) {
    ArrayList<Character> answerCharacters = new ArrayList<Character>();

    for(int i = 0; i<this.answer.length(); i++){
      answerCharacters.add(this.answer.charAt(i));
    }

    if (answerCharacters.contains(letter)) {
      if(guessedLetters.contains(letter)){
        System.out.println("This letter has already been guessed!");
        this.attempts -= 1;
        return false;
      } else {
        System.out.println("Correct!");
        guessedLetters.add(letter);
        return true;
      }
    }
    else {
      System.out.println("Wrong!");
      this.attempts -= 1;
      return false;
    }
  }

  public Boolean isGameLost() {
    if(getRemainingAttempts()==0){
      this.endGame = true;
    }
    return this.endGame;
  }

  public Boolean isGameWon(String guess) {
    if (!guess.contains("_")){
      endGame = true;
    }
    return this.endGame;
  }
  
}
