package OOP.Interface;

public class App {
    public static void main(String[] args) throws Exception {
        ITelephone timsPhone;
        timsPhone = new Desk(798022307);
        timsPhone.powerON();
        timsPhone.callPhone(798022307);
        timsPhone.answer();

        timsPhone = new MobilePhone(245656);
        timsPhone.powerON();
        timsPhone.callPhone(245656);
        timsPhone.answer();

    }
}
