public class Boxer {

    /**
     * Instantiate in Java means to call a constructor of a Class which creates an an instance or object,
     * of the type of that Class. Instantiation allocates the initial memory for the object and returns a reference.
     */

    //Public field
    private final String boxerName;
    private final int age;
    private final double weight;

    public Boxer(String boxerName, int age, double weight) {
        this.boxerName = boxerName;
        this.age = age;
        this.weight = weight;
    }

    public String getBoxerName() {
        return boxerName;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
}
