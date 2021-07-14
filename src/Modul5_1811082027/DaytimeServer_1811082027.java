/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811082027;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Salman Alfarissy
 */
public class DaytimeServer_1811082027 {
    public static final int SERVICE_PORT = 13;
    
    public static void main(String[] args) {
        try {
            ServerSocket server1811082027 = new ServerSocket(SERVICE_PORT);
            System.out.println("Daytime service started");
            
            for (;;) {
                
                Socket nextClient = server1811082027.accept();
                
                System.out.println("Received request from "+
                        nextClient.getInetAddress() +
                        nextClient.getPort());
                
                OutputStream out1811082027 = nextClient.getOutputStream();
                PrintStream pout1811082027 = new PrintStream(out1811082027);
                
                pout1811082027.print(new java.util.Date());
                
                out1811082027.flush();
                
                out1811082027.close();
                
                nextClient.close();
                
            }
        } catch (BindException e) {
            System.err.println("Service already runnung on port "+ SERVICE_PORT);
            
        } catch (IOException ex) {
            System.err.println("I/O error "+ ex);
        }
    }
    
}
