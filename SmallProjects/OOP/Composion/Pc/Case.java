package src.mypack;


public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

   

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }


    
    public void pressButton(){
        System.out.println("Power Button pressed");
    }

    public String getModel(){
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return String return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return String return the powerSupply
     */
    public String getPowerSupply() {
        return powerSupply;
    }

    /**
     * @param powerSupply the powerSupply to set
     */
    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    /**
     * @return Dimensions return the dimensions
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * @param dimensions the dimensions to set
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

}
