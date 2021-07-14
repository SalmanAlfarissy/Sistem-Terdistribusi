/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811082027;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Salman Alfarissy
 */
public class Writer1811082027 {
    public static void main(String[] args) throws IOException {
        String contents1811082027 = "cara menulis file dengan file writer";
        File file1811082027 = new File("file1811082027/WriterFile1811082027.txt");
        FileWriter fw1811082027 = new FileWriter(file1811082027);
        BufferedWriter buf1811082027 = new BufferedWriter(fw1811082027);
        buf1811082027.write(contents1811082027);
        buf1811082027.close();
        
    }
    
}
