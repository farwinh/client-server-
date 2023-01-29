/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruh.fot.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ruh.fot.student.DeptStudentData;
import ruh.fot.student.Student;


/**
 *
 * @author chandunigamage
 */
public class MyClient {
    public static void main(String[] args) {
        try {
            //Get the registry
            Registry reg = LocateRegistry.getRegistry("localhost", 4444);
            
            //lookup for the remote objects
            DeptStudentData stub = (DeptStudentData) reg.lookup("studentDataService");
            
            //Invoke methods using remote objects
            ArrayList<Student> students = stub.getAllStudents();
            
            for(Student stu: students){
                System.out.println("ID: " + stu.getUser_id());
                System.out.println("Name: " + stu.getUser_name());
                System.out.println("Email: " + stu.getUser_email());
                System.out.println();
            }
            
            
           
        } catch (RemoteException ex) {
            Logger.getLogger(MyClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(MyClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
