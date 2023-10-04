public class SpeedConverter {

    public static void main(String[] args) {

        System.out.println(toMilesPerHour(75.114));
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0){
            return -1;
        }
        long milesPerHour =  Math.round(kilometersPerHour /  1.609);
        return milesPerHour;
    }

}

       /*
       toMilesPerHour(1.5); → should return value 1
        toMilesPerHour(10.25); → should return value 6
        toMilesPerHour(-5.6); → should return value -1
        toMilesPerHour(25.42); → should return value 16
        toMilesPerHour(75.114); → should return value 47
       */