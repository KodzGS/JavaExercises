public class MegaBytesAndKiloBytes {

    private static final int NO_KB_IN_MB = 1024;

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(6000);
        // the parameter is called and defined from the method below as '6000'
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes/NO_KB_IN_MB;
        int remainder = kiloBytes%NO_KB_IN_MB;

        System.out.println("The Result is: " + kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
    }
}


/* Exercise 3:
Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.
For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
If the parameter kiloBytes is less than 0 then print the text "Invalid Value". */

