public class NumberOfDaysInMonth {


    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1, 2024));
    }

    // Write a method isLeapYear with a parameter of type int named year
    public static boolean isLeapYear(int year) {

        //The parameter needs to be greater than or equal to 1 and less than or equal to 9999
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    return year % 400 == 0;
                }
                return true;
            }
        }
        // If the parameter is not in that range return false.
        return false;
    }

    /**
     * If parameter month is < 1 or > 12 return -1.
     * If parameter year is < 1 or > 9999 then return -1.
     *
     * @param month month of the year as an int parameter
     * @param year  as an int parameter
     * @return no of days in a month of specified year
     */
    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        int noDaysInMonth = 0;
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    noDaysInMonth = 29;
                } else {
                    noDaysInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                noDaysInMonth = 30;
                break;
            default:
                noDaysInMonth = 31;

        }
        return noDaysInMonth;
    }
}

