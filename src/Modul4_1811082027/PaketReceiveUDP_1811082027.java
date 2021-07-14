/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_1811082027;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Salman Alfarissy
 */
public class PaketReceiveUDP_1811082027 {
    public static void main(String[] args) {
        System.out.println("Paket Receive\n=====================");
        System.out.println("Binding to local port 2000");
        try (DatagramSocket soket1811082027 = new DatagramSocket(2000)){
            System.out.println("Bound to local port "+soket1811082027.getLocalPort());
            
            DatagramPacket packet1811082027 = new DatagramPacket(new byte[256], 256);
            
            soket1811082027.receive(packet1811082027);
            System.out.println("Paket received!!");
            
            InetAddress remote_addr = packet1811082027.getAddress();
            System.out.println("Send by\t: "+remote_addr.getHostAddress());
            System.out.println("Send from\t: "+packet1811082027.getPort());
            
            ByteArrayInputStream bin = new ByteArrayInputStream(packet1811082027.getData());
            BufferedReader br1811082027 = new BufferedReader(new InputStreamReader(bin));
            System.out.print("Message\t: "+br1811082027.readLine()+"\n");
            
        } catch (Exception e) {
            System.err.println("Error\t: "+e.getMessage());
        }
    }
    
    
}
