public class SpeedConverter {

  public static void main(String[] args) {

    System.out.println(toMilesPerHour(75.114));
  }

  public static long toMilesPerHour(double kilometersPerHour) {

    if (kilometersPerHour < 0) {
      return -1;
    }
    return Math.round(kilometersPerHour / 1.609);
  }
}
