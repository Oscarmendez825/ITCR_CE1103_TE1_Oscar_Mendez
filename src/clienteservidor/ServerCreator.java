
package clienteservidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedList;


public class ServerCreator implements Runnable {
    private Socket port;//socket del server
    private DataInputStream datosentrada;//input stream del servidor
    private DataOutputStream datossalida;//output stream del servidor

    private LinkedList<Socket> users = new LinkedList<Socket>();//lista de usuarios 
    
 
    public ServerCreator(Socket port,LinkedList users){// constructor que administra la lista de usuarios y el socket
        this.port = port;
        this.users = users;
    }
    
    

    public void run() {
        try {
            //iniciar los canales de entrada y salida de datos
            datosentrada = new DataInputStream(port.getInputStream());
            datossalida = new DataOutputStream(port.getOutputStream());
            
            
            while(true){//Recibir los mensajes del cliente 
               String recibido = datosentrada.readUTF();
               
                for (int i = 0; i < users.size(); i++) {
                    datossalida = new DataOutputStream(users.get(i).getOutputStream());//enviar todos los mensajes a los usuarios activos 
                    datossalida.writeUTF(recibido);//enviar el mensaje 
                }
            }
        } catch (IOException e) {
            for (int i = 0; i < users.size(); i++) {
                if(users.get(i) == port){
                    users.remove(i);//eliminar el un usuario en caso de que se haya desconectado
                    break;
                } 
            }
        }
    }
}
