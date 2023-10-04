public class BarkingDog {

    private static int HOUR_VAL = 6;

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // If the hourOfDay parameter is less than 0 or greater than 23 return false || OR
        if (hourOfDay < 0 || hourOfDay > 23 || !barking) {
            return false;
        }
        // else We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true || OR
        else return hourOfDay < 8 || hourOfDay > 22;
    }

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, HOUR_VAL));
    }

}

