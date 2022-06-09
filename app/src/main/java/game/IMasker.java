package game;

import java.util.ArrayList;

interface IMasker {
  public String getWordToGuess(String answer, ArrayList<Character> guessedLetters);
  
}
