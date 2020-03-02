
package com.Client;


public class UserData {//class tha save the name of the user
    //Atribute
    private String nombre;

    public UserData(String nombre) {//constructor method
        this.nombre = nombre;
    }
    
    public String getNombre() {//gettig method
        return nombre;
    }

    public void setNombre(String nombre) {//setting method
        this.nombre = nombre;
    }

}


