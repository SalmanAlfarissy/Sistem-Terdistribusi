/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811082027;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Salman Alfarissy
 */
class ServerThread_1811082027 extends Thread{
    private Socket clientSocket = null;

    public ServerThread_1811082027(Socket clientSocket) {
        super();
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try (
            PrintWriter out1811082027 = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedInputStream bis1811082027 = new BufferedInputStream(clientSocket.getInputStream());
            ObjectInputStream ois1811082027 = new ObjectInputStream(bis1811082027);){
            Pesan_1811082027 pesan;
            while ((pesan = (Pesan_1811082027) ois1811082027.readObject()) != null) {
                System.out.println("Server Receive : "+pesan.toString());
                out1811082027.println("Pesan Diterima");
                if (pesan.getPesan().equalsIgnoreCase("Exit")) {
                    break;
                    
                }
                
            }
            
            
        } catch (IOException e) {
            Logger.getLogger(Server_1811082027.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Server_1811082027.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            if (clientSocket != null) {
                try {
                    clientSocket.close();
                } catch (Exception e) {
                    Logger.getLogger(Server_1811082027.class.getName()).log(Level.SEVERE, null, e);
                }       
            }
        }   
    } 
}
