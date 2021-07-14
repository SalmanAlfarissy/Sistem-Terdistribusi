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
public class SimplePacketReceiver_1811082027 {
    public static void main(String[] args) throws IOException{
        DatagramSocket soket1811082027 = new DatagramSocket(2000);
        DatagramPacket paket1811082027 = new DatagramPacket(new byte[256], 256);
        soket1811082027.receive(paket1811082027);
        
        String message = new String(paket1811082027.getData(), 0, paket1811082027.getLength());
        System.out.println(message);
    }
    
    
    
}
