public class Metody6 {
    public static void main(String[] args) {
        String word1 = "alfabet", word2 = "alfa";
        if (contains(word1, word2)) {
            System.out.println("Słowo \"" + word2 + "\" zawiera się w słowie \"" + word1 + "\".");
        } else {
            System.out.println("Słowo \"" + word2 + "\" nie zawiera się w słowie \"" + word1 + "\".");
        }
    }
    public static boolean contains (String firstWord, String secoundWord) {
        return firstWord.contains(secoundWord);
    }
}
