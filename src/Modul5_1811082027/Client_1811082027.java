/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811082027;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Salman Alfarissy
 */
public class Client_1811082027 {
    public static void main(String[] args) {
        String hostName = "localhost";
        int portNumber = 123;
        
        try (
            Socket echoSoket = new Socket(hostName, portNumber);
            BufferedOutputStream bos1811082027 = new BufferedOutputStream(echoSoket.getOutputStream());
            ObjectOutputStream oos1811082027 = new ObjectOutputStream(bos1811082027);
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSoket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));){
            String msg;
            while ((msg = stdIn.readLine()) != null) {
                oos1811082027.writeObject(new Pesan_1811082027("salman", msg));
                oos1811082027.flush();
                System.out.println("Client receive : "+in.readLine());
                
            }
        } catch (Exception e) {
            Logger.getLogger(Client_1811082027.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
