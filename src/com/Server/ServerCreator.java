
package com.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedList;


public class ServerCreator implements Runnable {
    private Socket port;//set the socket port
    private DataInputStream datain;//input data
    private DataOutputStream dataout;//output data

    private LinkedList<Socket> users = new LinkedList<Socket>();//active users list
    
 
    public ServerCreator(Socket port,LinkedList users){//Costructor that manage the socket and the users list
        this.port = port;
        this.users = users;
    }
    
    

    public void run() {
        try {
            //start the input and output channels
            datain = new DataInputStream(port.getInputStream());
            dataout = new DataOutputStream(port.getOutputStream());
            
            
            while(true){//Receive de clients messages
               String recibido = datain.readUTF();
               
                for (int i = 0; i < users.size(); i++) {
                    dataout = new DataOutputStream(users.get(i).getOutputStream());//send the message to all the active users
                    dataout.writeUTF(recibido);//send the message
                }
            }
        } catch (IOException e) {
            for (int i = 0; i < users.size(); i++) {
                if(users.get(i) == port){
                    users.remove(i);//Remove user if is disconnected
                    break;
                } 
            }
        }
    }
}
