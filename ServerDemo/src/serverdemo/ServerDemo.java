/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serverdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chandunigamage
 */
public class ServerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> quotes = new ArrayList<>();
        quotes.add("A");
        quotes.add("B");
        quotes.add("C");
        quotes.add("D");
        quotes.add("E");
        
        Random ran = new Random();
        int randomNum;
        
        try {
            ServerSocket ss = new ServerSocket(30000);
            
            Socket s = ss.accept();
            
            
             //Recieve things from client
            DataInputStream dis = new DataInputStream(s.getInputStream());
            
            //Send things to the client
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            
            /*
            1. When the client say hello server must reply with hello
            2. When the client say bye server must reply with bye and exit
            3. When the client say get server must send a motivational quote to the client (This motivation quote has to be random one)
            
            All the client msgs has to be read from the keyboard
            */
            
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
            Logger.getLogger(ServerDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
