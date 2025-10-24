package pkg30406539_shop;

public class OrderLine {
    // Initialisation of variables for OrderLine class.
    private int orderLineID;
    private String product;
    private int quantity;
    private Product price;
    private double lineTotal;
    
    // Constructor with everything to set default values.
    public OrderLine(){
        orderLineID = 0;
        product = "No name";
        quantity = 0;
        lineTotal = 0.0;
    }
    
    // Constructor with everything but lineTotal
    public OrderLine(int orderLineIDIn, String productIn, int quantityIn){
        orderLineID = orderLineIDIn;
        product = productIn;
        quantity = quantityIn;
        lineTotal = price.getPrice() * quantity;
    }
    
    // Getters
    public int getOrderLineID(){return orderLineID;}
    public String getProduct(){return product;}
    public int getQuantity(){return quantity;}
    public double getLineTotal(){return lineTotal;}
    public Product getPrice(){return price;}
    
    // Setters
    public void setOrderLineID(int orderLineIDIn){orderLineID = orderLineIDIn;}
    public void setProduct(String productIn){product = productIn;}
    public void setQuantity(int quantityIn){quantity = quantityIn;}
    public void setLineTotal(double lineTotalIn){lineTotal = lineTotalIn;}
}
