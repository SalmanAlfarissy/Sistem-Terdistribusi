/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811082027;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Salman Alfarissy
 */
public class Server_1811082027 {
    public static void main(String[] args) throws IOException {
        int portNumber = 123;
        try(
                ServerSocket serverSoket = new ServerSocket(portNumber);
                Socket clientSoket = serverSoket.accept();
                PrintWriter out1811082027 = new PrintWriter(clientSoket.getOutputStream(), true);
                BufferedInputStream bis1811082027 = new BufferedInputStream(clientSoket.getInputStream());
                ObjectInputStream ois1811082027 = new ObjectInputStream(bis1811082027);)
            
        {
            Pesan_1811082027 pesan;
            while ((pesan = (Pesan_1811082027) ois1811082027.readObject()) != null) {
                System.out.println("Server Recieve: "+pesan.toString());
                out1811082027.println("Pesan diterima");
                
            }
            
            
        } catch (IOException e) {
            Logger.getLogger(Server_1811082027.class.getName()).log(Level.SEVERE, null, e);
            
        } catch (ClassNotFoundException e){
            Logger.getLogger(Server_1811082027.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
