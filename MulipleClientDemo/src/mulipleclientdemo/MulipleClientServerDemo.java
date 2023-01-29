/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mulipleclientdemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chandunigamage
 */
public class MulipleClientServerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9876);
            
            while(true){
                Socket s = ss.accept();
                
                Thread t = new Thread(new Server(s));
                t.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(MulipleClientServerDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
