package mypack;

public class VipCustomer {
    private String customer_name;
    private double credit_Limit;
    private String customer_email;

    public VipCustomer(){
        this("Unknown",0,"Unknown");
    }

    
    public VipCustomer(String customerName, double credit_Limit){
        this(customerName,credit_Limit,"Unknown");
    }


    public VipCustomer(String customerName, String customer_email){
        this(customerName,0,customer_email);
    }

    public VipCustomer(double credit_Limit, String customer_email){
        this("Unknown",credit_Limit,customer_email);
    }


    
    public VipCustomer(String customerName, double credit_Limit, String customer_email){
        this.customer_name = customerName;
        this.credit_Limit = credit_Limit;
        this.customer_email= customer_email;
    }


    /**
     * @return String return the customer_name
     */
    public String getCustomer_name() {
        return customer_name;
    }

    /**
     * @param customer_name the customer_name to set
     */
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    /**
     * @return double return the credit_Limit
     */
    public double getCredit_Limit() {
        return credit_Limit;
    }

    /**
     * @param credit_Limit the credit_Limit to set
     */
    public void setCredit_Limit(double credit_Limit) {
        this.credit_Limit = credit_Limit;
    }

    /**
     * @return String return the customer_email
     */
    public String getCustomer_email() {
        return customer_email;
    }

    /**
     * @param customer_email the customer_email to set
     */
    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

}
