public class Metody3 {
  public static void main(String[] args) {
    int firstInteger = 10, secondInteger = 3;
    System.out.println(firstInteger + " x " + secondInteger + " = " + multiply2(firstInteger, secondInteger));
  }
  public static int multiply2(int firstNumber, int secondNumber) {
    int result = 0;
    for (int i = 0; i < firstNumber; i++) {
      result += secondNumber;
    }
    return result;
  }
}
