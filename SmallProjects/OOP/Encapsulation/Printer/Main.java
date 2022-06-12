package OOP.Encapsulation.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Start paghes " + printer.getPagesPrinted());
        printer.print(4);
        printer.print(2);
    }
}
