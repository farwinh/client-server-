/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hostlookup;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chandunigamage
 */   
public class HostLookUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //name of the hist
        String host = "www.stackoverflow.com";
        try {
            //ip addresses of the host name
            InetAddress[] ips = InetAddress.getAllByName(host);
            
            for(InetAddress ip: ips){
                System.out.println(ip.toString());
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(HostLookUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
