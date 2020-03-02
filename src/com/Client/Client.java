
package com.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;


public class Client implements Runnable {
    //Atributes
        JEditorPane window;
        private Socket port;//port for a client
        private int genport = 1201;//the number of the port
         private String ip = JOptionPane.showInputDialog("Digite la ip del servidor: ");
        private DataInputStream datain;//input data 
        private DataOutputStream dataout;//output data 
        private String message;//variable to save the message
        



    public Client(JEditorPane window){//this method take control of input and output data of the panel in ClientExec class
        this.window = window;
        try {
            port = new Socket(ip,genport);//make the connection to the server
            datain = new DataInputStream(port.getInputStream());//read the input data
            dataout = new DataOutputStream(port.getOutputStream());//read the output data
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void run() {//this method take and read the messages
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
     public void sendmessage(String message){//this method send the messages to the other users
        try {
            dataout.writeUTF(message);//send messages
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}