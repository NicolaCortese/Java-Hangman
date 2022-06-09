package game;

import java.util.ArrayList;

public class Masker implements IMasker {
  
  public String getWordToGuess(String answer, ArrayList<Character> guessedLetters){
    
    Integer answerLength = answer.length();
    StringBuilder guess = new StringBuilder(answer);
    guess.delete(1,answerLength);

    for (int i = 1; i < answerLength; i++) {
      Character letter = answer.charAt(i);
      if(guessedLetters.contains(letter)){
        guess.append(letter);
      }
      else{
        guess.append("_");
      }
    }
    return guess.toString();
  }

}
