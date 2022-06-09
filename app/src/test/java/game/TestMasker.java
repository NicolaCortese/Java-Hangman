package game;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class TestMasker {
  @Test public void testGetsWordToGuess() {
    String answer = "MAKERS";
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    guessedLetters.add('A');
    Masker masker = new Masker();
    assertEquals(masker.getWordToGuess(answer,guessedLetters) , "MA____");
  }
  
  @Test public void testGetsTwoLetters() {
    String answer = "MAKERS";
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    guessedLetters.add('A');
    guessedLetters.add('R');
    Masker masker = new Masker();
    assertEquals(masker.getWordToGuess(answer,guessedLetters) , "MA__R_");
  }

  @Test public void testTwoSameLetters() {
    String answer = "MAKEERS";
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    guessedLetters.add('E');
    Masker masker = new Masker();
    assertEquals(masker.getWordToGuess(answer,guessedLetters) , "M__EE__");
  }


}
