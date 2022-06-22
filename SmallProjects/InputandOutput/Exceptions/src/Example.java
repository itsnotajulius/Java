package InputandOutput.Exceptions.src;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println("Result is: " + result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform, autopilot shutting down");
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static int getInt(String var) {

        int num;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter in INTEGER for " + var);
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter in number using only 0 to 9");
            num = getInt(var);
        }

        return num;
    }

    private static int divide() {
        int x, y;

        try {
            x = getInt("x");
            y = getInt("y");
            System.out.println("X is: " + x + ", and Y is: " + y);
            throw new ArithmeticException("attempt to divide by 0");
        } catch (Exception e) {
            throw new ArithmeticException("No suitable input");
        }
    }

}
