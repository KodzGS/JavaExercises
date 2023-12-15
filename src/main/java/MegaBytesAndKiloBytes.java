public class MegaBytesAndKiloBytes {

  private static final int NO_KB_IN_MB = 1024;

  public static void main(String[] args) {
    printMegaBytesAndKiloBytes(6000);
  }

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    int megaBytes = kiloBytes / NO_KB_IN_MB;
    int remainder = kiloBytes % NO_KB_IN_MB;

    System.out.println("The Result is: " + kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
  }
}