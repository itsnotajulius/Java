package mypack;

import java.util.Arrays;

public class ProblemALG005b {
    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public int sizeOfShape;
    public int xCentre;
    public int yCentre;
    public String[][] shape = new String[25][80];
    public int xBoundMin = 0;
    public int xBoundMax = 80;
    public int yBoundMin = 0;
    public int yBoundMax = 26;

    public ProblemALG005b(int sizeOfShape, int xCentre, int yCentre) {
        if (sizeOfShape >= 2 && sizeOfShape <= 9) {
            this.sizeOfShape = sizeOfShape;
        } else {
            System.out.println(INVALID_VALUE_MESSAGE + " sizeOfShape");
            System.exit(0);
        }
        if (xCentre > xBoundMin && xCentre < xBoundMax) {
            this.xCentre = xCentre - 1;
        } else {
            System.out.println(INVALID_VALUE_MESSAGE + " xCentre");
            System.exit(0);
        }
        if (yCentre > yBoundMin && yCentre < yBoundMax) {
            this.yCentre = yCentre - 1;
        } else {
            System.out.println(INVALID_VALUE_MESSAGE + " yCentre");
            System.exit(0);
        }
    }

    public void makeShape() {
        String str = "";
        for (int i = 0; i < 25; i++) {
            int wid = xBoundMax - 1;
            int countTen = 1;
            str = "";
            if (i == 9 || i == 19) {
                str += (i + 1) / 10 + ",";
                wid -= 1;
                countTen++;
            }
            int j;
            for (j = 0; j < wid; j++) {
                if (countTen == 10 || countTen == 20 || countTen == 30 || countTen == 40 || countTen == 50
                        || countTen == 60 || countTen == 70) {
                    str += countTen / 10 + ",";
                } else {
                    str += "=" + ",";
                }
                countTen++;
            }
            // str += "\n";
            shape[i] = str.split(",");

        }
    }

    public void makeDiamond() {
        shape[yCentre][xCentre] = "$";
        int countPos = sizeOfShape - 1;
        int posYMinux, posXMinus, posYPlus, posXPlus;
        for (int i = 0; i < sizeOfShape; i++) {
            posYMinux = yCentre - countPos + i;
            posYPlus = yCentre + countPos - i;
            posXMinus = xCentre - i;
            posXPlus = xCentre + i;

            if (!(posYMinux <= yBoundMin + 1 || posXPlus >= xBoundMax - 1)) {
                shape[yCentre - countPos + i][xCentre + i] = "$";

            }
            if (!(posYMinux <= yBoundMin + 1 || posXMinus <= xBoundMin)) {

                shape[yCentre - countPos + i][xCentre - i] = "$";

            }
            if (!(posYPlus >= yBoundMax - 1 || posXMinus <= xBoundMin)) {

                shape[yCentre + countPos - i][xCentre - i] = "$";

            }
            if (!(posXPlus >= xBoundMax - 1 || posYPlus >= yBoundMax - 1)) {

                shape[yCentre + countPos - i][xCentre + i] = "$";
            }

        }
    }

    public void drawShape() {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < xBoundMax - 1; j++) {
                System.out.print(shape[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ProblemALG005b problem = new ProblemALG005b(6, 30, 9);
        problem.makeShape();
        problem.makeDiamond();
        problem.drawShape();
        // System.out.println(Arrays.deepToString(problem.shape));
    }

}
