public class Constructors {

  public static void main(String[] args) {
    Boxer boxers = new Boxer("Miguel Angel Cotto", 43, 160.8);
    System.out.println(boxers.getBoxerName() + " " + boxers.getAge() + " " + boxers.getWeight());
  }
}

