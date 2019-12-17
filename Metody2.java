public class Znaki9 {
  public static void main(String[] args) {
    String firstString = "Ala ma ", secondString = "kota i psa.";
    System.out.println(concatenate(firstString, secondString));
  }
  public static String concatenate(String firstWord, String secondWord) {
    return firstWord + secondWord;
  }
}
