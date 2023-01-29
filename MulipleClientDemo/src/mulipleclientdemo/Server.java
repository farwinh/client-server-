/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mulipleclientdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chandunigamage
 */
public class Server implements Runnable{
    ArrayList<String> quotes = new ArrayList<>();
    Socket s;
    
    Random ran = new Random();
    int randomNum;

    public Server(Socket s) {
        this.s = s;
        
        quotes.add("A");
        quotes.add("B");
        quotes.add("C");
        quotes.add("D");
        quotes.add("E");
    }
    
    

    @Override
    public void run() {
        try {
            //Recieve things from client
            DataInputStream dis = new DataInputStream(s.getInputStream());
            //Send things to the client
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            
            
            while(true){
                String msg = dis.readUTF();
                
                if(msg.equals("Hello")) {
                    dos.writeUTF("Hello");
                }
                else if(msg.equals("Bye")) {
                    dos.writeUTF("Bye");
                    System.exit(0);
                }
                else if(msg.equals("Get")){
                    randomNum = ran.nextInt(quotes.size());
                    dos.writeUTF(quotes.get(randomNum));
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
