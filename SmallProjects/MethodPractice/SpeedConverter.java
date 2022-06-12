package MethodPractice;

public class SpeedConverter {

    // Summary: Converting Kilometer to Miles

    public static long toMilesPerHour(double kilometersPerHour) {
        long answer = -1L;
        if (kilometersPerHour >= 0) {
            answer = Math.round(kilometersPerHour / 1.609);
        }
        return answer;

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + Math.round(kilometersPerHour / 1.609) + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) throws Exception {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}
