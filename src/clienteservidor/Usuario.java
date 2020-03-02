
package clienteservidor;


public class Usuario {
//Atributos
    private String nombre;

    public Usuario(String nombre) {//Constructor de la clase usuario
        this.nombre = nombre;
    }

    public String getNombre() {//Getter
        return nombre;
    }

    public void setNombre(String nombre){ //Setter
        this.nombre = nombre;
    }
    
}


