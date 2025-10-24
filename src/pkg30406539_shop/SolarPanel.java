package pkg30406539_shop;

public class SolarPanel extends Product{
    // Initialisation of variable wattage output as it's a variable only for solar panels.
    private int wattageOutput;
    
    // Constructor to set default value of wattage output.
    public SolarPanel(){
        wattageOutput = -1;
    }
    
    // Constructor with everything but Product ID.
    public SolarPanel(String productNameIn, double priceIn, int stockLevelIn, int wattageOutputIn){
        super(productNameIn, priceIn, stockLevelIn);
        wattageOutput = wattageOutputIn;
    }
    
    // Getters
    public int getWattageOutput(){
        return wattageOutput;
    }
    
    // Setters
    public void setWattageOutput(int wattageOutputIn){
        wattageOutput = wattageOutputIn;
    }
}
