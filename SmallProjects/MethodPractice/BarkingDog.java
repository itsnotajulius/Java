package MethodPractice;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean answer = false;
        if (barking && (hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <= 23)) {
            answer = true;
        }
        return answer;

    }
}