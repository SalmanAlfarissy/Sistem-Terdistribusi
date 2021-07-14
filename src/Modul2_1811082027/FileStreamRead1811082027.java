/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811082027;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Salman Alfarissy
 */
public class FileStreamRead1811082027 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream file1811082027 = new FileInputStream("file1811082027/ReadFile1811082027.txt");
        int data1811082027 = file1811082027.read();
//        System.out.println(data1811082027);
        
        while(data1811082027 != -1){
            System.out.print((char)data1811082027);
            data1811082027=file1811082027.read();
        }
        file1811082027.close();
        
        
    }
    
}
