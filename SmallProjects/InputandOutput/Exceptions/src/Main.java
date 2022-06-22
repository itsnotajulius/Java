package InputandOutput.Exceptions.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int x = getIntEAFP("x");
        int y = getIntEAFP("y");
        System.out.println("This is x: " + x + ", This is y: " + y);
        System.out.println(divideEAFP(x, y));
        getInt("");
        getIntLBYL("var");
        divideLBYL(x, y);
        divideE(x, y);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    // Will throw errors if not INT
    private static int getInt(String var) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter in Integer for " + var + " ");
            return scanner.nextInt();
        }
    }

    private static int getIntLBYL(String var) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Enter in Integer for " + var + " ");
        String input = scanner.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        int output;
        if (isValid) {
            output = Integer.parseInt(input);
        } else {
            System.out.println("Not valid input");
            output = 0;
        }
        scanner.close();
        return output;
    }

    private static int getIntEAFP(String var) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter in Integer for " + var + " ");
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e);
                return 0;
            } catch (Exception e) {
                System.out.println(e);
                return 0;
            }
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static int divideLBYL(int x, int y) {

        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    // will catch 0
    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }

    }

    // Will throw errors
    private static int divideE(int x, int y) {
        return x / y;
    }

}
