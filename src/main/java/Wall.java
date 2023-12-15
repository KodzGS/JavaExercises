public class Wall {

  /**
   * The class needs two fields (instance variables) with name width and height of type double.
   */
  private double width;
  private double height;

  /**
   * The second constructor has parameters width and height of type double and it needs to initialize the fields. in case the height parameter is less
   * than 0 it needs to set the height field value to 0. In case the width is less than 0 it needs to set the width field value to 0,
   */
  public Wall(double width, double height) {

    if (width < 0) {
      width = 0;
    }
    if (height < 0) {
      height = 0;
    }
    this.width = width;
    this.height = height;
  }

  /**
   * instance Method named getWidth without any parameters
   * @return it needs to return the value of width field.
   */
  public double getWidth() {
    return width;
  }

  /**
   * Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs
   * to set the width field value to 0.
   */
  public void setWidth(double width) {
    if (width < 0) {
      width = 0;
    }
    this.width = width;
  }

  /**
   * instance Method named getHeight without any parameters
   * @return it needs to return the value of height field.
   */
  public double getHeight() {
    return height;
  }

  /**
   * Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs
   * to set the height field value to 0.
   */
  public void setHeight(double height) {
    if (height < 0) {
      height = 0;
    }
    this.height = height;
  }

  /**
   * Method named getArea without any parameters, it needs to return the area of the wall.
   */
  public double getArea() {
    return getWidth() * getHeight();
  }
}
