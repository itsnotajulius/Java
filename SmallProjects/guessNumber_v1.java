import java.util.Scanner;

public class guessNumber_v1 {
    private int input;

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public void printStuff(String printText) {
        System.out.println(printText);
    }

    public int getRandom() {
        return (int) (Math.random() * 100);
    }

    public void checkNumb(int guessNum, int ansNum) {
        if (guessNum > ansNum) {
            printStuff("To High");
        } else if (guessNum < ansNum) {
            printStuff("To Low");
        } else {
            printStuff("Just right it is: " + ansNum);
        }

    }

    public static void main(String[] args) throws Exception {
        guessNumber_v1 myApp = new guessNumber_v1();
        try (Scanner myScan = new Scanner(System.in)) {
            int ranNum = myApp.getRandom();

            int guess = -1;
            myApp.printStuff("You need to guess the number \nIts between 0 and 100\n\nMake your guess:");
            do {

                while (!myScan.hasNextInt()) {
                    System.out.println("Not a Number go again:");
                    myScan.next();
                }
                guess = myScan.nextInt();
                System.out.println(guess + "");

                myApp.setInput(guess);

                myApp.checkNumb(myApp.getInput(), ranNum);
            } while (myApp.getInput() != ranNum);

        }
    }
}
