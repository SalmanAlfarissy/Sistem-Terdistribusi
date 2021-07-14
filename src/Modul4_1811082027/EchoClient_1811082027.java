/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_1811082027;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
       
/**
 *
 * @author Salman Alfarissy
 */
public class EchoClient_1811082027 {
    public static final int SERVICE_PORT = 7;
    
    public static final int BUFSIZE = 4096;
    
    public static void main(String[] args) throws SocketException, IOException {
        String hostname = "localhost";
        InetAddress addr = InetAddress.getByName(hostname);
        DatagramSocket soket1811082027 = new DatagramSocket();
        soket1811082027.setSoTimeout(2000);
        
        BufferedReader reader1811082027 = new BufferedReader(new InputStreamReader(System.in));
        
        for (;;){
            System.out.println("Write your message here ..");
            ByteArrayOutputStream bout1811082027 = new ByteArrayOutputStream();
            PrintStream pout1811082027 = new PrintStream(bout1811082027);
            pout1811082027.print(reader1811082027.readLine());
            
            byte[] barray = bout1811082027.toByteArray();
            
            DatagramPacket paket1811082027 = new DatagramPacket(barray, barray.length, addr, SERVICE_PORT);
            System.out.println("Sending packet to "+ hostname);
            soket1811082027.send(paket1811082027);
            
            System.out.println("Waiting for packet...");
            
            byte[] recbuf = new byte[BUFSIZE];
            DatagramPacket receivePacket = new DatagramPacket(recbuf, BUFSIZE);
            
            boolean timeout = false;
            
            try {
                soket1811082027.receive(receivePacket);
            } catch (InterruptedIOException ioe) {
                timeout = true;
            }
            
            if (!timeout){
                System.out.println("Packet Received!!");
                System.out.println("Details : "+ receivePacket.getAddress());
                
                ByteArrayInputStream bin = new ByteArrayInputStream(receivePacket.getData(),
                0, receivePacket.getLength());
                
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(bin));
                
                System.out.println(reader2.readLine());
                
                
            }else {
                System.out.println("Packet lost!!");
            }
        }
    }
    
    
}
