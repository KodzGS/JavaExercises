public class TeenNumberChecker {

  public static void main(String[] args) {
    System.out.println(hasTeen(13, 20, 23));
  }

  public static boolean hasTeen(int number1, int number2, int number3) {

    System.out.println("Numbers to check: " + number1 + " | " + number2 + " | " + number3);

    return (number1 >= 13 && number1 <= 19) || (number2 >= 13 && number2 <= 19) || (number3 >= 13 && number3 <= 19);

  }
}
