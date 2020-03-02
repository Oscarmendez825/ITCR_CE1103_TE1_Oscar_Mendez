
package com.Client;

/**
 * This class is responsible for storing the username, as well as providing it when required.
 * @author Oscar Méndez Granados
 * @version 0.5
 */
public class UserData {//class tha save the name of the user
    //Atribute
    private String name;
/**
 * Is responsible for giving the value of a name to the variable
 * @param name String
 */
    public UserData(String name) {//constructor method
        this.name = name;
    }
/**
 * This method is in charge to return the username
 * @return name del usuario
 */
    public String getNombre() {//gettig method
        return name;
    }
/**
 * This method is in charge to set the username into the name variable 
 * @param name String
 */
    public void setNombre(String name) {//setting method
        this.name = name;
    }

}


