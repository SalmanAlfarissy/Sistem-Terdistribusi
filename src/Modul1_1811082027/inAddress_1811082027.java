/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1_1811082027;

import java.net.InetAddress;

/**
 *
 * @author Salman Alfarissy
 */
public class inAddress_1811082027 {
    public static void main(String[] args) {
        try{
            System.out.println("# Get hostname from current ip");
            String ip = "173.252.120.6";
            System.out.println("Hostname from ip \""+ip+"\": "
                    +InetAddress.getByName(ip).getHostName());
            
            System.out.println("# Get host address from current name");
            String host = "www.google.com";
            System.out.println("Host/Ip: "
                        +InetAddress.getByName(host).getHostAddress());
 
            System.out.println("Host/Ip: "
                        +InetAddress.getByName(host));
            
            System.out.println("\n# Check connection");
            InetAddress ia = InetAddress.getByName(host);
            
            if (ia.isReachable(3000)) {
                System.out.println(ia+" is Reachable");
                
            }else{
                System.out.println(ia+"is UnReachable");
            }
               
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
