package OOP.Composion.Pc;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 5, "Yellow");
    }

}
