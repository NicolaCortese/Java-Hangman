package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class GameTest {
  @Test public void testGuessLetter() {
    WordChooser mockWordChooser = mock(WordChooser.class);
    when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Masker mockMasker = mock(Masker.class);
    String playerName = "Lau";
    Game game = new Game(mockWordChooser, mockMasker, playerName);

    assertEquals(game.guessLetter('E'), true);
  }

  @Test public void testWrongGuessLetter() {
    WordChooser mockWordChooser = mock(WordChooser.class);
    when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Masker mockMasker = mock(Masker.class);
    String playerName = "Lau";
    Game game = new Game(mockWordChooser, mockMasker, playerName);

    assertEquals(game.guessLetter('P'), false);
  }

  


}