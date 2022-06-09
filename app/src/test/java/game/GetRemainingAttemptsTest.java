package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class GetRemainingAttemptsTest {
  @Test public void startsWithTenAttempts() {
    WordChooser mockWordChooser = mock(WordChooser.class);
    when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Masker mockMasker = mock(Masker.class);
    String playerName = "Lau";
    Game game = new Game(mockWordChooser, mockMasker, playerName);
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }
  
  
}
