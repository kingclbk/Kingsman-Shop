package pkg30406539_shop;

//Initalisation of variables within the customer class.

import java.util.HashMap;

public class Customer extends User{
    private String addressLine1;
    private String addressLine2;
    private String town;
    private String postcode;
    private boolean isRegistered;
    private HashMap<Integer, Order> orderLines;
    
    
// Constructor to set default values for each of the variables within customer class.
public Customer(){
        addressLine1 = "No address line.";
        addressLine2 = "No address line,";
        town = "No town.";
        postcode = "No post code.";
        isRegistered = false;
        orderLines = new HashMap();
    }

// Constructor with everything but isRegistered.
public Customer(String usernameIn, String passwordIn, String firstNameIn, String lastNameIn, String addressLine1In, String addressLine2In, String townIn, String postcodeIn){
        super(usernameIn, passwordIn, firstNameIn, lastNameIn);
        addressLine1 = addressLine1In;
        addressLine2 = addressLine2In;
        town = townIn;
        postcode = postcodeIn;
        isRegistered = false;
        orderLines = new HashMap();
    }

// Getters
public String getAddressLine1(){return addressLine1;}
public String getAddressLine2(){return addressLine2;}
public String getTown(){return town;}
public String getPostcode(){return postcode;}
public boolean getIsRegistered(){return isRegistered;}
public HashMap<Integer, Order> getOrderLines(){return orderLines;}

// Setters
public void setAddressLine1(String addressLine1In){addressLine1 = addressLine1In;}
public void setAddressLine2(String addressLine2In){addressLine2 = addressLine2In;}
public void setTown(String townIn){addressLine1 = townIn;}
public void setPostcode(String postcodeIn){addressLine1 = postcodeIn;}
public void setIsRegistered(boolean isRegisteredIn){isRegistered = isRegisteredIn;}

}



