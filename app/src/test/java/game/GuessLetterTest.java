package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class GuessLetterTest {
  @Test public void testWrongGuessLetter() {
    WordChooser mockWordChooser = mock(WordChooser.class);
    when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Masker mockMasker = mock(Masker.class);
    String playerName = "Lau";
    Game game = new Game(mockWordChooser, mockMasker, playerName);
    assertEquals(game.guessLetter('C'), Boolean.valueOf(false));
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(9));
  }

  @Test public void testRightGuessLetter() {
    WordChooser mockWordChooser = mock(WordChooser.class);
    when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Masker mockMasker = mock(Masker.class);
    String playerName = "Lau";
    Game game = new Game(mockWordChooser, mockMasker, playerName);
    assertEquals(game.guessLetter('R'), Boolean.valueOf(true));
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }

  
}
