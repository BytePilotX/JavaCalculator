package JavaCalculator;
import java.io.IOException;
import java.util.Scanner;
import JavaCalculator.Scripts.function;
public class Calculator {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            function script = new function();
            String printresult;
            Scanner scanner = new Scanner(System.in);
            System.out.println("What type of calculation would you like to perform (Addition = +) (Subtraction = -)\n(Division = /) (Multiplication = x) : \n");

            String choiceOfOperation = scanner.nextLine();

            if (choiceOfOperation.equals("exit")) {
                break;
            }

            System.out.println("What is the first value you are using? : \n");

            String value1 = scanner.nextLine();

            System.out.println("What is the second value you are using? : \n");

            String value2 = scanner.nextLine();

            Double firstvalue = Double.parseDouble(value1);

            Double secondvalue = Double.parseDouble(value2);

            if (choiceOfOperation.equalsIgnoreCase("Addition") || choiceOfOperation.equals("+")) {
                printresult = script.addition(firstvalue, secondvalue);
            }

            else if (choiceOfOperation.equalsIgnoreCase("Subtraction") || choiceOfOperation.equals("-")) {
                printresult = script.subtraction(firstvalue, secondvalue);
            }

            else if (choiceOfOperation.equalsIgnoreCase("Division") || choiceOfOperation.equals("/")) {
                printresult = script.division(firstvalue, secondvalue);
            }

            else if (choiceOfOperation.equalsIgnoreCase("Multiplication") || choiceOfOperation.equals("x")) {
                printresult = script.multiplication(firstvalue, secondvalue);
            }

            else {
                printresult = "error";
            }
            System.out.println("Your result is: " + printresult);
            Thread.sleep(1000);
        }

    }
}
