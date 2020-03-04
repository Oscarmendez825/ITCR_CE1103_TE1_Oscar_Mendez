
package com.Client;


import com.Server.UserType;
/**
 * Class that inherit from UserType and indicates tha the Client is started
 * @author Oscar Méndez Granados
 * @version 0.5
 */
public class UserTypeC extends UserType{//clase--herencia
    /**
     * shows that the client has been started
     */
    public void TypeofUser(){//metodo---sobreescritura
        System.out.println("Client Started");
    }
}
