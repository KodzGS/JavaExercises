public class SimpleCalculator {

  /**
   * The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
   */
  private double firstNumber;
  private double secondNumber;

  /**
   * Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
   * @param firstNumber double firstNumber to be calculated
   */
  public void setFirstNumber(double firstNumber) {
    this.firstNumber = firstNumber;
  }

  /**
   * Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
   * @param secondNumber double secondNumber to be calculated
   */
  public void setSecondNumber(double secondNumber) {
    this.secondNumber = secondNumber;
  }

  /**
   * Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
   * @return addition of firstNumber and secondNumber
   */
  public double getAdditionResult() {
    return firstNumber + secondNumber;
  }

  /**
   * Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the
   * firstNumber. * @return subtraction of firstNumber and secondNumber
   */
  public double getSubtractionResult() {
    return firstNumber - secondNumber;
  }

  /**
   * Method named getMultiplicationResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from
   * the firstNumber.
   * @return multiplication firstNumber * secondNumber;
   */
  public double getMultiplicationResult() {
    return firstNumber * secondNumber;
  }

  /**
   * Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the
   * secondNumber. In case the value of secondNumber is 0 then return 0.\
   * @return division of firstNumber * secondNumber;
   */
  public double getDivisionResult() {
    if (secondNumber == 0) {
      return this.secondNumber = 0;
    } else return firstNumber / secondNumber;
  }
}
