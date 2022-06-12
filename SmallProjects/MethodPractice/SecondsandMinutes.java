package MethodPractice;

public class SecondsandMinutes {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int mins, int secs) {
        String answer = INVALID_VALUE_MESSAGE;

        if (mins >= 0 && (secs >= 0 && secs <= 59)) {
            String hours = mins / 60 + "h ";
            if (mins / 60 < 10) {
                hours = "0" + hours;
            }
            String remainMins = mins % 60 + "m ";
            if (mins % 60 < 10) {
                remainMins = "0" + remainMins;
            }
            String secondString = secs + "s";
            if (secs < 10) {
                secondString = "0" + secondString;
            }
            answer = hours + remainMins + secondString;
        }
        return answer;

    }

    public static String getDurationString(int secs) {
        String answer = "Invalid value";
        if (secs >= 0) {
            answer = getDurationString(secs / 60, secs % 60);
        }
        return answer;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }
}
