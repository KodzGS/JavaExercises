public class Constructors {
    public static void main(String[] args) {
        Boxers boxers = new Boxers("Miguel Cotto", 43, 160.8);
        System.out.println(boxers.getBoxerName() + " " + boxers.getAge() + " " + boxers.getWeight());
    }
}

