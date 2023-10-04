public class DecimalComparator {


    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        // casting
        int newNum1 = (int) (num1 * 1000);
        int newNum2 = (int) (num2 * 1000);

        System.out.println("number 1 | "  + newNum1 + " number 2 | " + newNum2);

        if (newNum1 == newNum2) {
            return true;
        }
        return false;
    }

}
