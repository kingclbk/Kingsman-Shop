package pkg30406539_shop;

public class Staff extends User {
    //Initialisation of variables within the staff class.
    private String position;
    private double salary;
    
// Constructor to give default values.
public Staff(){
    position = "No position.";
    salary = -1.1;
}

// Constructor for everything
public Staff(String usernameIn, String passwordIn, String firstNameIn, String lastNameIn, String positionIn, double salaryIn){
    super(usernameIn, passwordIn, firstNameIn, lastNameIn);
    position = positionIn;
    salary = salaryIn;
    
}


// Getters
public String getPosition(){return position;}
public double getSalary(){return salary;}

//Setters
public void setPosition(String positionIn){position = positionIn;}
public void setSalary(double salaryIn){salary = salaryIn;}
    
}
