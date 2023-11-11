public class Constructors {
    public static void main(String[] args) {
        Boxers boxerName = new Boxers("Miguel Cotto", 43, 160.8);
        System.out.println(boxerName.getBoxerName() + " " + boxerName.getAge() + " " + boxerName.getWeight());

    }
}

