public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 46));
    }

    /* 1st parameter should be of type boolean and be named summer it represents if it is summer
       2nd parameter represents the temperature and is of type int with the name temperature. */
    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        // ternary command true left false right
        int upperBound = summer ? 45 : 35;

        // with ternary command upper bound
        if (temperature >= 25 && temperature <= upperBound){
            return true;
        }
        else return false;
    }

}
