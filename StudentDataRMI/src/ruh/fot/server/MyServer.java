/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruh.fot.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import ruh.fot.student.DeptStudentDataImpl;

/**
 *
 * @author chandunigamage
 */
public class MyServer {
    public static void main(String[] args) {
                
        try {
            //Create remote object
            DeptStudentDataImpl stub = new DeptStudentDataImpl();
            
            //Create a remote registry
            Registry reg = LocateRegistry.createRegistry(4444);
            
            //Register the remote objects to the registry and advertise
            reg.rebind("studentDataService", (Remote) stub);
            
            System.out.println("Server is connected and running.....");
        } catch (RemoteException ex) {
            System.out.println("Server is not connected....." + ex.getMessage());
        }
    }
    
}
