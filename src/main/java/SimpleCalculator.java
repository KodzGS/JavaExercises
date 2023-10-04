public class SimpleCalculator {


    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }

    /**
     * The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
     */
    private double firstNumber;
    private double secondNumber;

    /**
     * Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
     */
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
     */
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    /**
     * Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
     */
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    /**
     * Method named getMultiplicationResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
     */
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    /**
     * Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
     */
    public double getDivisionResult() {
        if (secondNumber == 0) {

            return this.secondNumber = 0;

        } else return firstNumber / secondNumber;

    }
}
