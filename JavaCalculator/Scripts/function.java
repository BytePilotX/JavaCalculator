package JavaCalculator.Scripts;

public class function {
    public static String addition(Double value1, Double value2) {
        String result = Double.toString(value1 + value2);
        return result;
    }

    public static String subtraction(Double value1, Double value2) {
        String result = Double.toString(value1 - value2);
        return result;
    }

    public static String division(Double value1, Double value2) {
        String result = Double.toString(value1 / value2);
        return result;
    }

    public static String multiplication(Double value1, Double value2) {
        String result = Double.toString(value1 * value2);
        return result;
    }
}