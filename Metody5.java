public class Metody5 {
  public static void main(String[] args) {
    String sentence =  "ala ma kota";
    char character = 'a';
    System.out.println("W zdaniu \"" + sentence + "\" litera \"" + character +"\" występuję "+ howManyCharInWord(sentence, character) + " razy.");
  }
  public static int howManyCharInWord(String word, char letter) {
    int result = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == letter) {
        result++;
      }
    }
    return result;
  }
}
