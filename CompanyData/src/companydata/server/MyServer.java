package companydata.server;
import companydata.comp.UserDataImpl;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MyServer {
    
    public static void main(String[] args) {
        try {
            UserDataImpl ud = new UserDataImpl();
            Registry reg = LocateRegistry.createRegistry(1234);
            reg.rebind("userData", (Remote)ud);
            System.out.println("Server is connected and running.....");
        } catch (RemoteException ex) {
            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
