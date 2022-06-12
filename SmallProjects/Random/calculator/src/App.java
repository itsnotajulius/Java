package Random.calculator.src;

public class App {
    public static float[] plusArray;;

    public static void main(String[] args) throws Exception {
        plusArray = new float[] { 1, 2, 3, 4, 5, 6 };
        Formulas myFormulaObj = new Formulas();
        System.out.println(myFormulaObj.plus(plusArray));
    }
}
