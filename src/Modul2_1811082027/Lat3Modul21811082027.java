/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811082027;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author Salman Alfarissy
 */
public class Lat3Modul21811082027 {
    public static void main(String[] args) throws IOException {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu : ");
        System.out.print("1.Menulis dengan stream"
                + "\n2.Menulis dengan filewriter"
                + "\n3.exit\n");
        System.out.println("==========================");
        System.out.print("pilihan : ");
        int pilihan = scanner.nextInt();
        
        do{
            switch (pilihan){
                case 1 : {
                    String path1811082027 = "file1811082027/Lat3Modul21811082027.txt";
                    OutputStream output1811082027 = new FileOutputStream(path1811082027);
                    System.out.println("Open "+path1811082027+" For writing..");
                    String data1811082027 = "cara menulis file dengan stream";

                    for (int i = 0; i < data1811082027.length(); i++) {
                        output1811082027.write((byte)data1811082027.charAt(i));

                    }
                    output1811082027.close();
                    System.out.println("Output Stream Closed...");
                  
                    System.out.print("pilihan : ");
                    pilihan = scanner.nextInt();
                    break;
                }
                case 2 : {
                    String contents1811082027 = "cara menulis file dengan file writer";
                    String path = "file1811082027/Lat3Modul21811082027.txt";
                    File file1811082027 = new File(path);
                    System.out.println("Open "+path+" For Writing..");
                    FileWriter fw1811082027 = new FileWriter(file1811082027);
                    BufferedWriter buf1811082027 = new BufferedWriter(fw1811082027);
                    buf1811082027.write(contents1811082027);
                    
                    buf1811082027.close();
                    System.out.println("Output FileWriter Closed..");
                    
                    System.out.print("pilihan : ");
                    pilihan = scanner.nextInt();
                    break;
                }
                
                case 3 :{
                    System.out.println("Exit");
                    break;
                }
                default:
                    System.out.println("Pilihan anda salah..\nplease try agin!!");
                    System.out.print("Pilihan : ");
                    pilihan = scanner.nextInt();
                
            }
        }while(pilihan != 3);
        
        
    }
    
    
}
