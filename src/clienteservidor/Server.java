
package clienteservidor;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;


public class Server {
    private final int genport =1201;//Establecer el puerto del servidor
    private final int cantidadusuarios=10;//Cantidad maxima de usuarios para evitar retrasos

    private LinkedList<Socket> users = new LinkedList<Socket>();//lista con los usuarios activos
    
    public void startserver(){
        try {
            ServerSocket server = new ServerSocket(genport,cantidadusuarios);//pasar los valores de cantidad de usuarios y el puerto del server
            
            while(true){//inicializar el server
                System.out.println("Server iniciado...");
                System.out.println("Esperando usuarios...");
                
                
                Socket client = server.accept();//Aceptar un nuevo cliente
                users.add(client);//agregar el nuevo cliente a la lista
                
                Runnable  run = new ServerCreator(client,users);//hacer un nuevo hilo para ejecutar el cliente
                Thread thread = new Thread(run);
                thread.start();//iniciar el hilo
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } public static void main(String[] args) {
        Server server = new Server();
        server.startserver();//iniciar el server
    }
}
