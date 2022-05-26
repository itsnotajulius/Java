package src.Interfacess;

public interface ITelephone {
    public void powerON();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
