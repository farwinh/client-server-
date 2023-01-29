package companydata.comp;
import java.rmi.*;
import java.util.ArrayList;
public interface UserData extends Remote{
    public ArrayList<users> getInfo() throws RemoteException;
}
