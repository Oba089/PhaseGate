public class CharacterCounter {

  public static int countCharacterOccurrences(String word, char letter) {
    int count = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == letter) {
        count++;
      }
    }
    return count;
  }

