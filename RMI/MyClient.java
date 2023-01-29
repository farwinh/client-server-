import java.rmi.*;

public class MyClient {
	public static void main(String[] args) {
		try {
			//Lookup for the remote registry
			Hello stub = (Hello)Naming.lookup("rmi://localhost:6000/helloservice");
			
			//Invoke method in the remote object
			String msg = stub.printHello();
			System.out.println(msg);
		} catch(Exception ex) {
			System.out.println(ex);
		}
	}	
}