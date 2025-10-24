package pkg30406539_shop;

public class User {
    //Attributes Initialisation + Information Hiding
    private String username;
    private String password;
    private String firstName;
    private String lastName;

//Constructors to initialise attributes within a class with proper default values
public User(){
        username = "No username.";
        password = "No password.";
        firstName = "No first name.";
        lastName = "No last name.";
    }

public User(String usernameIn, String passwordIn, String firstNameIn, String lastNameIn){
        username = usernameIn;
        password = passwordIn;
        firstName = firstNameIn;
        lastName = lastNameIn;
    }

// Methods
// Access Modifier Public, returnModifier String methodName(input parameters)
// Getter methods
public String getUsername(){return username;}
public String getPassword(){return password;}   
public String getFirstName(){return firstName;}
public String getLastName(){return lastName;}

// Setters
public void setUsername(String usernameIn){username = usernameIn;}
public void setPassword(String passwordIn){password = passwordIn;}
public void setFirstName(String firstNameIn){firstName = firstNameIn;}
public void setLastName(String lastNameIn){lastName = lastNameIn;}
}





