/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811082027;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Salman Alfarissy
 */
public class FileWriteStream1811082027 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path1811082027 = "file1811082027/MengisiFile1811082027.txt";
        OutputStream output1811082027 = new FileOutputStream(path1811082027);
        System.out.println("Open "+path1811082027+" For writing..");
        String data1811082027 = "Contoh Mengisi data di file java";
        
        for (int i = 0; i < data1811082027.length(); i++) {
            output1811082027.write((byte)data1811082027.charAt(i));
            
        }
        output1811082027.close();
        System.out.println("Output Strem Closed...");
       
    }
    
}
