public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 2));

    }

    public static boolean hasEqualSum(int number1, int number2, int result) {
        System.out.println(number1 + " + " + number2 + " = " + result);

        // ** Test 1

        /*
        int calc = (number1 + number2);
        if (calc == result) {
            return true;
        }
        return false;
        }
       */

       // ** Test 2

       /*
       if (number1 + number2 == result) {
            return true;
        }
        return false;
        */

        // ** Test 3

        if (result != (number1 + number2)) {
            return false;
        }
        return true;
    }
}