/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811082027;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 *
 * @author Salman Alfarissy
 */
public class Lat2Modul21811082027 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = reader.readLine();
        
        System.out.println("Data dari User : "+ userInput);
        
        String path1811082027 = "file1811082027/Lat2Modul21811082027.txt";
        OutputStream outputStream = new FileOutputStream(path1811082027);
         System.out.println("Open "+path1811082027+" For writing..");
         
         for (int i = 0; i < userInput.length(); i++) {
            outputStream.write((byte)userInput.charAt(i));
            
        }
        outputStream.close();
        System.out.println("Output Strem Closed...");
        
        
    }
    
}
