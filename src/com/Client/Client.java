
package com.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;

/**
 * This class is responsible for connecting to the server, it is also responsible for sending and receiving messages to display them on the screen
 * @author Oscar Méndez Granados
 * @version 0.5
 */
public class Client implements Runnable {
    //Atributes
        JEditorPane window;
        private Socket port;//port for a client
        private int genport = 1201;//the number of the port
         private String ip = JOptionPane.showInputDialog("Digite la ip del servidor: ");
        private DataInputStream datain;//input data 
        private DataOutputStream dataout;//output data 
        private String message;//variable to save the message
        


/**
 * this method take control of input and output data and also the panel in ClientExec class
 * @param window JEditorPane 
 */
    public Client(JEditorPane window){
        this.window = window;
        try {
            port = new Socket(ip,genport);//make the connection to the server
            datain = new DataInputStream(port.getInputStream());//read the input data
            dataout = new DataOutputStream(port.getOutputStream());//read the output data
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * this method take and read the messages and show the messages on screen
     */
     public void run() {
        try{
            while(true){
                message += datain.readUTF();//read message and save it in a string variable
                System.out.println(message);
                window.setText(message);//show the message in screen
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
     /**
      * this method send the messages to the other users
      * @param  message String 
      */
     public void sendmessage(String message){
        try {
            dataout.writeUTF(message);//send messages
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}