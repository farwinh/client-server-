import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
	public static void main(String[] args) {
		try {
			//Create a remote object
			HelloRemote obj = new HelloRemote();
	
			//Bind the remote object in the remote registry
			//1st para --> Name of the registry
			//2nd para --> Remote object
			Naming.rebind("rmi://localhost:6000/helloservice", obj);
		
			System.out.println("Server is running....");
		} catch(Exception ex) {
			System.out.println("Server not connected....");
		}
	}	
}