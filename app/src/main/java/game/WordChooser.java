package game;

import java.util.Random;

class WordChooser implements IWordChooser {
  static final String[] DICTIONARY = {"MAKERS", "CANDY"};

  public String getRandomWordFromDictionary(){
    Random rand = new Random();
    Integer randomi = rand.nextInt(DICTIONARY.length);
    return DICTIONARY[randomi];
  }
}