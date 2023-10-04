public class PlayingCat2 {


    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 35));
    }

    /* 1st parameter should be of type boolean and be named summer it represents if it is summer
       2nd parameter represents the temperature and is of type int with the name temperature. */
    public static boolean isCatPlaying(boolean summer, int temperature) {

        boolean isTemperatureOver25 = temperature >= 25;
        int upperBound = getTempUpperBound(summer);
        return isTemperatureOver25 && temperature <= upperBound;

    }

    private static int getTempUpperBound(boolean summer) {

        // ternery
        return summer ? 45 : 35;


    }
}


