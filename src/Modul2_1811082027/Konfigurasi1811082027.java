package Modul2_1811082027;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman Alfarissy
 */
public class Konfigurasi1811082027 {
     public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br1811082027 = new BufferedReader(new FileReader("file1811082027/Konfigurasi1811082027.conf"));
        String line1811082027 = null;
        while ((line1811082027=br1811082027.readLine())!=null){
            String[] konfigurasi = line1811082027.split("@");
            String host = konfigurasi[0];
            String user = konfigurasi[1];
            String pass = konfigurasi[2];
            String port = konfigurasi[3];
            String db = konfigurasi[4];
            System.out.println("Host : "+host);
            System.out.println("User : "+user);
            System.out.println("Password : "+pass);
            System.out.println("Port : "+port);
            System.out.println("Database : "+db);
            
        }
        br1811082027.close();
    }
    
}
