package pkg30406539_shop;

public class Heatpump extends Product{
    //Initialisation of efficiencyRating variable which is the only variable introduced within this class.
    private double efficiencyRating;
    
// Constructor to give efficiency rating a default value to avoid crashes.
public Heatpump(){
    efficiencyRating = -1.1;
}

// Constructor with everything.
public Heatpump(int productIDIn, String productNameIn, double priceIn, int stockLevelIn, double efficiencyRatingIn){
    super(productIDIn, productNameIn, priceIn, stockLevelIn);
    efficiencyRating = efficiencyRatingIn;
}

// Constructor with everything but productID.
public Heatpump(String productNameIn, double priceIn, int stockLevelIn, double efficiencyRatingIn){
    super(productNameIn, priceIn, stockLevelIn);
    efficiencyRating = efficiencyRatingIn;
}

// Getters
public double getEfficiencyRating(){return efficiencyRating;}

// Setters
public void setEfficiencyRating(double efficiencyRatingIn){efficiencyRating = efficiencyRatingIn;}
}
