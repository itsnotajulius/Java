package src.Interfacess;



public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;
    

    
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }


    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the Mobile phone");
            isRinging = false;
        }
        
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber  && isOn){
            isRinging = true;
            System.out.println("Ring ring");
        }else{
            isRinging = false;
            System.out.println("Mobile phone not on or wrong number");
        }
        return false;
    }
    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now rining "+phoneNumber+" on mobile phone");
        }else{
            System.out.println("Phone is off");
        }
        
        
    }
    @Override
    public boolean isRinging() {
        return false;
    }
    @Override
    public void powerON() {
        isOn = true;
        System.out.println("Mobile phone is powered up");
        
    }
}
