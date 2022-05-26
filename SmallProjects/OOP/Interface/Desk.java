package src.Interfacess;

public class Desk implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    

    
    public Desk(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
        
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        }else{
            isRinging = false;
        }
        return false;
    }
    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now rining "+phoneNumber);
        
    }
    @Override
    public boolean isRinging() {
        return false;
    }
    @Override
    public void powerON() {
        System.out.println("No action taken");
        
    }
    
    
}
