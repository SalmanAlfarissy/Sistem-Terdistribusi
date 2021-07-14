/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_1811082027;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Salman Alfarissy
 */
public class EchoServer_1811082027 {
    
    public static final int SERVICE_PORT = 7;
    
    public static final int BUFSIZE = 4096;
    
    private DatagramSocket soket1811082027;
    
    public EchoServer_1811082027() {
        try {
            soket1811082027 = new DatagramSocket(SERVICE_PORT);
            System.out.println("Server active on port "+ soket1811082027.getLocalPort());
            
        } catch (Exception e) {
            System.err.println("Unable to bind port");
        }
    }
    
    public void serviceClients_1811082027(){
        byte[] buffer = new byte[BUFSIZE];
        for (;;) {
            try {
                
                DatagramPacket paket1811082027 =new DatagramPacket(buffer, BUFSIZE);
                
                soket1811082027.receive(paket1811082027);
                System.out.println("Paket received from "
                + paket1811082027.getAddress() + ":"
                +paket1811082027.getPort()
                +"of length "+ paket1811082027.getLength());
                
                soket1811082027.send(paket1811082027);
            } catch (IOException e) {
                System.err.println("Error : " +e);
            }
            
        }
    }
    public static void main(String[] args) {
        EchoServer_1811082027 server1811082027 = new EchoServer_1811082027();
        server1811082027.serviceClients_1811082027();
    }
    
}
