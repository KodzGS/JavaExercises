public class LeapYear {

  private static final int YEAR_VAL = 1989;

  public static void main(String[] args) {
    System.out.println(isLeapYear(YEAR_VAL));
  }

  // Write a method isLeapYear with a parameter of type int named year
  public static boolean isLeapYear(int year) {

    //The parameter needs to be greater than or equal to 1 and less than or equal to 9999
    if (year > 1 && year < 9999) {
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          return year % 400 == 0;
        }
        return true;
      }
    }
    // If the parameter is not in that range return false.
    return false;
  }

}


