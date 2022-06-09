package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class TestIsGameLost {
  @Test public void testLostGame() {
    WordChooser mockWordChooser = mock(WordChooser.class);
    when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Masker mockMasker = mock(Masker.class);

    String playerName = "Lau";
    Game game = new Game(mockWordChooser, mockMasker, playerName);
    
    assertEquals(game.isGameLost(), false);

    for(int i = 0; i<10; i++){
      game.guessLetter('L');
    }
    
    assertEquals(game.isGameLost(), true);
  }

}
