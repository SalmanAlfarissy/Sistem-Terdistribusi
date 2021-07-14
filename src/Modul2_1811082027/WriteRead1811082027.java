/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811082027;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *
 * @author Salman Alfarissy
 */
public class WriteRead1811082027 {
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu : ");
        System.out.print("1.Write :\n"
                + "\n2.Read :\n");
        
        System.out.print("pilihan : ");
        int pilihan = scanner.nextInt();
        
            switch (pilihan){
                case 1 : {
                    Scanner scanner2 = new Scanner(System.in);
                    
                    System.out.println("Menu : ");
                    System.out.print("a.FileOutputStream"
                            + "\nb.BufferWriter\n");
                    
                    System.out.print("pilihan2 : ");
                    String pilihan2 = scanner2.nextLine();
                    switch(pilihan2){
                        case "a" :{
                            String path1811082027 = "file1811082027/LatWriteRead1811082027.txt";
                            OutputStream output1811082027 = new FileOutputStream(path1811082027);
                            System.out.println("Open "+path1811082027+" For writing..");
                            String data1811082027 = "cara menulis file dengan stream";

                            for (int i = 0; i < data1811082027.length(); i++) {
                                output1811082027.write((byte)data1811082027.charAt(i));

                            }
                            output1811082027.close();
                            System.out.println("Output Stream Closed...");

                            System.out.print("pilihan : ");
         
                            
                        }
                        case "b" : {
                            String contents1811082027 = "cara menulis file dengan file writer";
                            String path = "file1811082027/LatWriteRead1811082027.txt";
                            File file1811082027 = new File(path);
                            System.out.println("Open "+path+" For Writing..");
                            FileWriter fw1811082027 = new FileWriter(file1811082027);
                            BufferedWriter buf1811082027 = new BufferedWriter(fw1811082027);
                            buf1811082027.write(contents1811082027);

                            buf1811082027.close();
                            System.out.println("Output FileWriter Closed..");

                            break;
                            
                        }
                    }
             
                    break;
                }
                case 2 : {
                    Scanner scanner3 = new Scanner(System.in);
                    
                    System.out.println("Menu : ");
                    System.out.print("1.FileInputStream"
                            + "\n2.BufferReader\n");
                    
                    System.out.print("pilihan2 : ");
                    int pilihan3 = scanner3.nextInt();
                    switch(pilihan3){
                        case 1 :{
                            InputStream file1811082027 = new FileInputStream("file1811082027/LatWriteRead1811082027.txt");
                            int data1811082027 = file1811082027.read();

                            while(data1811082027 != -1){
                                System.out.print((char)data1811082027);
                                data1811082027=file1811082027.read();
                            }
                            file1811082027.close();

                            break;
                            
                        }
                        case 2 : {
                            BufferedReader br1811082027 = new BufferedReader(new FileReader("file1811082027/LatWriteRead1811082027.txt"));
                            String line1811082027 = null;
                            while ((line1811082027=br1811082027.readLine())!=null){
                                System.out.print(line1811082027);
                            }
                            br1811082027.close();
                            
                        }
                    }
             
                    break;
                    
                }
                
                default:
                    System.out.println("Pilihan anda salah..");
 
            }
        
        
    }
    
}
