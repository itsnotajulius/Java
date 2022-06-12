package MethodPractice;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        boolean answer = false;
        if ((int) (num1 * 1000) == (int) (num2 * 1000)) {
            answer = true;
        }
        return answer;

    }
}