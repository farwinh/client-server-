package companydata.comp;
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class UserDataImpl extends UnicastRemoteObject implements UserData{
    public UserDataImpl() throws RemoteException{
        super();
    }
    
    @Override
    public ArrayList<users> getInfo() throws RemoteException {
        ArrayList<users> user = new ArrayList<users>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/company";
            String userN="root";
            String pw="";
            
            Connection con = DriverManager.getConnection(url,userN,pw);
            
            Statement st = con.createStatement();
            String query = "select *from users";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                System.out.println(""+rs.getInt(1));
                users u = new users();
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setAge(rs.getInt(3));
                
                user.add(u);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDataImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDataImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
}
