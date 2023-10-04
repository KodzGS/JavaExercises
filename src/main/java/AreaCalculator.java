public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
    }

    public static double area (double radius){

        //TIP: For PI use a constant from Math class e.g. Math.PI
        double radiusCalc = radius * radius * Math.PI;

        // If the parameter radius is negative then return -1.0 to represent an invalid value.
        if (radius < 0.0) {
            return 1.0;
        }

        else return radiusCalc;
    }
    //Method overloading in java is a feature that allows a class to have more than one method with the same name, but with different parameters.
    public static double area (double x, double y){

       // TIP: The formula for calculating the area of a rectangle is x * y.
        double rectangleArea = x * y;

        //If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
        if ((x < 0.0) || (y < 0.0)){
            return 1.0;
        }
        else return rectangleArea;
    }
}
