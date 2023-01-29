package companydata.client;
import companydata.comp.UserData;
import companydata.comp.users;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClient {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost",1234);
            
            UserData ud = (UserData)reg.lookup("userData");
            
            ArrayList<users> userD= ud.getInfo();
            System.out.println("Cleint running");
            for(users u : userD){
                System.out.println(""+u.getName());
                System.out.println(""+u.getAge());
                System.out.println(""+u.getId());
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MyClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(MyClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
