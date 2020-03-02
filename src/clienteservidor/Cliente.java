
package clienteservidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;


public class Cliente implements Runnable {
    //Atributos
        JEditorPane ventana;
        private Socket port;//socket del cliente
        private int genport = 1201;//puerto cliente - servidor
         private String ip = JOptionPane.showInputDialog("Digite la ip del servidor: ");
        private DataInputStream datosentrada;//input stream cliente 
        private DataOutputStream datossalida;//output stream cliente 
        private String mensaje;//variable para guardar el mensaje
        



    public Cliente(JEditorPane ventana){//constructor que controla la ventana del ClientExec
        this.ventana = ventana;
        
        try {
            port = new Socket(ip,genport);//hacer la conexion con el server
            datosentrada = new DataInputStream(port.getInputStream());//leer los datos de entrada
            datossalida = new DataOutputStream(port.getOutputStream());//leer los datos de salida
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void run() {//leer el mensaje
        try{
            while(true){
                mensaje += datosentrada.readUTF();//leer el mensaje y almacenarlo en la variable mensaje
                System.out.println(mensaje);
                ventana.setText(mensaje);//desplegar el mensaje en pantalla
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
     public void mandarmensaje(String mensaje){//mandar mensajes a otros usuarios
        try {
            datossalida.writeUTF(mensaje);//enviar el mensaje
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}