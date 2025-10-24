package pkg30406539_shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class DBManager {
    //Initialisation of constant variables used for the connection of the database.
    private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    private final String connectionString = "jdbc:ucanaccess://Data\\Car_Database.accdb";
    
    //Method to load all the customers.
    public ArrayList<Customer> loadCustomers(){
        ArrayList<Customer> allCustomers = new ArrayList();
        //Connection to Database
    try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Customers");
            
            //Sets each value in the database and stores it in a temporary string/integer
            //then creates a new customer and process repeats
            while(rs.next()){
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String addressLine1 = rs.getString("AddressLine1");
                String addressLine2 = rs.getString("AddressLine2");
                String town = rs.getString("Town");
                String postcode = rs.getString("Postcode");
                
                //Adds a new customer based on the information stored above taken from the database.
                Customer c = new Customer(username, password, firstName, lastName, addressLine1, addressLine2, town, postcode);
                allCustomers.add(c);
            }
        }
    
        
        catch(Exception ex){
            System.out.println("Error Loading Customers: " + ex.getMessage());
        }
        
        finally{
            return allCustomers;
        }

}
    
    //Method to load all Staff members
    public ArrayList<Staff> loadStaff(){
        ArrayList<Staff> allStaff = new ArrayList();
        //Connection to Database
    try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Staff");
            
            //Sets each value in the database and stores it in a temporary string/integer
            //then creates a new staff member and process repeats
            while(rs.next()){
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String position = rs.getString("Position");
                double salary = rs.getInt("Salary");
                
                //Adds a new staff member based on the information stored above taken from the database.
                Staff s = new Staff(username, password, firstName, lastName, position, salary);
                allStaff.add(s);
            }
        }
        
        catch(Exception ex){
            System.out.println("Error Loading Staff: " + ex.getMessage());
        }
        
        finally{
            return allStaff;
        }
    
    
    }
}

