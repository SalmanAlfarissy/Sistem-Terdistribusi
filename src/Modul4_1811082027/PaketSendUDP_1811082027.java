/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_1811082027;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/**
 *
 * @author Salman Alfarissy
 */
public class PaketSendUDP_1811082027 {
    public static void main(String[] args) throws IOException {
        System.out.println("Paket Send\n===================");
        String hostname = "localhost";
        
        System.out.println("Binding to a local port");
        
        try (DatagramSocket soket1811082027 = new DatagramSocket()){
            System.out.println("Bound to local port "+soket1811082027.getLocalPort());
            
            ByteArrayOutputStream bout1811082027 = new ByteArrayOutputStream();
            PrintStream pout1811082027 = new PrintStream(bout1811082027);
            pout1811082027.print("Assalamua'laikum Warrahamatullahi Wabarakatuh");
            
            byte[] barray = bout1811082027.toByteArray();
            
            DatagramPacket paket1811082027 = new DatagramPacket(barray, barray.length);
            
            System.out.println("Looking up hostname "+hostname);
            InetAddress remot_addr = InetAddress.getByName(hostname);
            System.out.println("Hostname resolved as "+remot_addr.getHostAddress());
            
            paket1811082027.setAddress(remot_addr);
            
            paket1811082027.setPort(2000);
            
            soket1811082027.send(paket1811082027);
            System.out.println("Paket send!!");
                 
        } catch (SocketException ex) {
            System.err.println("Error: "+ex.getMessage());
        }catch(IOException e){
            System.err.println("Error: "+e.getMessage());
        }
    }
    
    
}
