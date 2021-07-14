/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1_1811082027;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Salman Alfarissy
 */
public class LocalHostDemo_1811082027 {
     public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        System.out.println("looking up local host");
        InetAddress localAddress = InetAddress.getLocalHost();
        
        System.out.println("Nama : "+localAddress.getHostName());
        System.out.println("Ip Address :"+localAddress.getHostAddress());
        System.out.println(localAddress);
     }
    
}
