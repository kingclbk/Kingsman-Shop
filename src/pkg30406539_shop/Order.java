
package pkg30406539_shop;

import java.util.Date;
import java.util.HashMap;

public class Order {
    //Initialisation of variables for the Order class which includes the hashmap of orderLines.
    private int orderID;
    private Date date = new Date();
    private double orderTotal;
    private String status;
    private HashMap<Integer, OrderLine> orderLines;
    
    //Constructor with no parameters.
    public Order(){
        orderID = -1;
        date = new Date();
        orderTotal = -1.0;
        status = "Processing";
        orderLines = new HashMap();
    }
    
    //Constructor with everything but orderLines.
    public Order(int orderIDIn, Date dateIn, double orderTotalIn, String statusIn){
        orderID = orderIDIn;
        date = dateIn;
        orderTotal = orderTotalIn;
        status = statusIn;
        orderLines = new HashMap();
    }
    
    //Getters
    public int getOrderID(){return orderID;}
    public Date getDate(){return date;}
    public double getOrderTotal(){return orderTotal;}
    public String getStatus(){return status;}
    public HashMap<Integer, OrderLine> getOrderLines(){return orderLines;}
    
    //Setters
    public void setOrderID(int orderIDIn){orderID = orderIDIn;}
    public void setDate(Date dateIn){date = dateIn;}
    public void setOrderTotal(double orderTotalIn){orderTotal = orderTotalIn;}
    public void setStatus(String statusIn){status = statusIn;}
    public void setOrderLines(HashMap orderLinesIn){orderLines = orderLinesIn;}
    
}
