
package com.Server;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;


public class Server {
    private final int genport =1201;//Set the port that comunicates clients and server
    private final int userscant=10;//Set the max quantity of users that will be connected at the same time

    private LinkedList<Socket> users = new LinkedList<Socket>();//make a list with the active users
    UserTypeS tipo = new UserTypeS();//Object of UserTypeC class that show what type of user get started
    public void startserver(){
        try {
            ServerSocket server = new ServerSocket(genport,userscant);//Set the port and the limit of users
            //Make the connection Server-Client
            while(true){
                System.out.println("Server Started....");
                System.out.println("Waiting for users...");
                tipo.TypeofUser();//call the typeofuser method to show what type of user start to working
                
                Socket client = server.accept();//accept the client connection
                users.add(client);//add the user into the users list
                
                Runnable  run = new ServerCreator(client,users);//make a new thread to execute the new client
                Thread thread = new Thread(run);
                thread.start();//start the thread
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } public static void main(String[] args) {
        Server server = new Server();
        server.startserver();
    }
}
