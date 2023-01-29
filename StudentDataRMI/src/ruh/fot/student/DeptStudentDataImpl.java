/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruh.fot.student;

import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeptStudentDataImpl extends UnicastRemoteObject implements DeptStudentData{

    public DeptStudentDataImpl() throws RemoteException {
        super();
    }
    

    public ArrayList<Student> getAllStudents() throws RemoteException {
        ArrayList<Student> students = new ArrayList<Student>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/faculty";
            String user = "root";
            String password = "root#123";
            Connection conn = DriverManager.getConnection(url, user, password);
            
            Statement st = conn.createStatement();
            String query = "select * from student";
            ResultSet result = st.executeQuery(query);
            
            while(result.next()) {
                Student stu = new Student();
                stu.setUser_id(result.getInt(1));
                stu.setUser_name(result.getString(2));
                stu.setUser_email(result.getString(3));
                
                students.add(stu);
            }
                    
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeptStudentDataImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DeptStudentDataImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return students;
    }
    
}
