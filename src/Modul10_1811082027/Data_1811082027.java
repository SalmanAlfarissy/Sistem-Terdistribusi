/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811082027;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author RyderPhantom
 */
public class Data_1811082027 extends UnicastRemoteObject implements DataInterface_1811082027{
    String str = null;

    public Data_1811082027() throws RemoteException{
    }
    
    @Override
    public void FirstMethod() throws RemoteException {
        System.out.println("Running First Method");
    }

    @Override
    public void SecondMethod() throws RemoteException {
        System.out.println("Running Second Method");
    }

    @Override
    public void salam() throws RemoteException {
        try {
            DatagramSocket socket_2027 = new DatagramSocket(1009);
            DatagramPacket packet_2027 = new DatagramPacket(new byte[256], 256);
            socket_2027.receive(packet_2027);
            
            String message = new String(packet_2027.getData(), 0, packet_2027.getLength());
            System.out.println("Assalamu'alaikum ["+message+"]");
        } catch (SocketException ex) {
        } catch (IOException ex) {
        }
    }

    @Override
    public void KalkulatorSederhana() throws RemoteException {        
        try {
            DatagramSocket socket_2027 = new DatagramSocket(1009);
            DatagramPacket packet_2027 = new DatagramPacket(new byte[256], 256);
            socket_2027.receive(packet_2027);
            
            str = new String(packet_2027.getData(), 0, packet_2027.getLength());
            System.out.println("Hasil ["+str+"]");
            if(str != null){
                str = str.replace(" ", ",");
                String[] split = str.split(",");
                double hasil = 0;
                String out;
                switch (split[1]) {
                    case "+":
                        hasil = Double.valueOf(split[0]) + Double.valueOf(split[2]);
                        out = String.valueOf(hasil);
                        break;
                    case "-":
                        hasil = Double.valueOf(split[0]) - Double.valueOf(split[2]);
                        out = String.valueOf(hasil);
                        break;
                    case "/":
                        if(split[2].equals("0")){
                            out = "Tidak dilakukan";
                        } else{
                            hasil = Double.valueOf(split[0]) / Double.valueOf(split[2]);
                            out = String.valueOf(hasil);
                        }   break;
                    case "x":
                        hasil = Double.valueOf(split[0]) * Double.valueOf(split[2]);
                        out = String.valueOf(hasil);
                        break;
                    default:
                        out = "Format tidak sesuai";
                        break;
                }
                System.out.println(out);
            } else{
                System.out.println("Data Tidak Terkirim");
            }
        } catch (SocketException ex) {
        } catch (IOException ex) {
        }
    }
}