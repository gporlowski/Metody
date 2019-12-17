public class Metody4 {
  public static void main(String[] args) {
    int firstInteger = 7, secondInteger = 4;
    System.out.println(firstInteger + " do potęgi " + secondInteger + " = " + power(firstInteger, secondInteger));
  }
  public static int power(int base, int exponent) {
    int result = base;
    for (int i = 1; i < exponent; i++) {
      result *= base;
    }
    return result;
  }
}
