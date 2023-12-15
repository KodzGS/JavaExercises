public class EqualSumChecker {

  public static void main(String[] args) {
    System.out.println(hasEqualSum(1, 1, 2));
  }

  public static boolean hasEqualSum(int number1, int number2, int result) {
    System.out.println(number1 + " + " + number2 + " = " + result);
    return result == (number1 + number2);
  }
}