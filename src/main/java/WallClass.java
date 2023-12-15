public class WallClass {

  public static void main(String[] args) {
    Wall wall = new Wall(7, 4);
    System.out.println("area= " + wall.getArea());
    wall.setWidth(7);
    wall.setHeight(4);
    System.out.println("width= " + wall.getWidth());
    System.out.println("height= " + wall.getHeight());
    System.out.println("area= " + wall.getArea());
  }

}
