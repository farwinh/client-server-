/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chandunigamage
 */
public class ClientDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Socket s = new Socket("localhost", 9876);
            
            //Recieve things from server
            DataInputStream dis = new DataInputStream(s.getInputStream());
            
            //Send things to the server
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            
            System.out.println("Select from below menu");
            System.out.println("Enter \"Hello\" if you want to say hello to the server");
            System.out.println("Enter \"Get\" if you want to get a motivational quote from the server");
            System.out.println("Enter \"Bye\" if you want to say bye to the server");
            
            while (true) { 
                System.out.print("Client: ");
                String answer = input.next();
                
                if(answer.equalsIgnoreCase("hello")) {
                    dos.writeUTF("Hello");
                    System.out.println("Server: " + dis.readUTF());
                }
                else if(answer.equalsIgnoreCase("bye")){
                    dos.writeUTF("Bye");
                    System.out.println("Server: " + dis.readUTF());
                    System.exit(0);  
                }
                else if(answer.equalsIgnoreCase("get")){
                    dos.writeUTF("Get");
                    System.out.println("Server: " + dis.readUTF());
                }
                else {
                    System.out.println("Enter a valid answer");
                }
                
                
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(ClientDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
