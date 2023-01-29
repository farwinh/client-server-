/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ruh.fot.student;


import java.rmi.*;
import java.util.ArrayList;
/**
 *
 * @author chandunigamage
 */
public interface DeptStudentData extends Remote{
    public ArrayList<Student> getAllStudents() throws RemoteException;
}
