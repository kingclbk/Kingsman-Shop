package pkg30406539_shop;

public class Product {
    //Attributes Initialisation + Information Hiding
    private int productID;
    private String productName;
    private double price;
    private int stockLevel;

    //Constructors to initialise attributes within a class with proper default values
public Product(){
        productID = -1;
        productName = "No product name.";
        price = -1.0;
        stockLevel = -1;
    }

//Constructor for everything
public Product(int productIDIn, String productNameIn, double priceIn, int stockLevelIn){
        productID = productIDIn;
        productName = productNameIn;
        price = priceIn;
        stockLevel = stockLevelIn;
    }

//Constructor without productID
public Product(String productNameIn, double priceIn, int stockLevelIn){
        productName = productNameIn;
        price = priceIn;
        stockLevel = stockLevelIn;
    }

// Methods
   // Access Modifier Public, returnModifier String methodName(input parameters)
// Getter methods
public int getProductID(){return productID;}
public String getProductName(){return productName;}   
public double getPrice(){return price;}
public int getStockLevel(){return stockLevel;}

// Setter methods
public void setProductID(int productIDIn){productID = productIDIn;}
public void setProductName(String productNameIn){productName = productNameIn;}
public void setFirstName(double priceIn){price = priceIn;}
public void setLastName(int stockLevelIn){stockLevel = stockLevelIn;}
}
