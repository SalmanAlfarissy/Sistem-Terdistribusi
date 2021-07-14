/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811082027;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Salman Alfarissy
 */
public class BufferReader1811082027 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br1811082027 = new BufferedReader(new FileReader("file1811082027/BufferReader1811082027.txt"));
        String line1811082027 = null;
        while ((line1811082027=br1811082027.readLine())!=null){
            System.out.print(line1811082027);
        }
        br1811082027.close();
    }
    
}
