/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_1811082027;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author Salman Alfarissy
 */
public class SimplePaketSend_1811082027 {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket soket1811082027 = new DatagramSocket();
        String message = "Assalamua'laikum Warahmatullahi Wabarakatuh..";
        DatagramPacket paket1811082027 = new DatagramPacket(message.getBytes(),
        message.length(), InetAddress.getLocalHost(), 2000);
        soket1811082027.send(paket1811082027);
        soket1811082027.close();
    }
    
}
