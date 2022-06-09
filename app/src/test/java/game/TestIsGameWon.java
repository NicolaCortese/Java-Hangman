package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class TestIsGameWon {
  @Test public void testWonGame() {
    WordChooser mockWordChooser = mock(WordChooser.class);
    when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Masker mockMasker = mock(Masker.class);

    String playerName = "Lau";
    Game game = new Game(mockWordChooser, mockMasker, playerName);
    
    String incompleteGuess = "M_KERS";
    String correctGuess = "MAKERS";

    assertEquals(game.isGameWon(incompleteGuess), false);
    assertEquals(game.isGameWon(correctGuess), true);
  }
  

}
