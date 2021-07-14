/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811082027;

import static Modul3_1811082027.Lat1Modul1811082027.player;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Salman Alfarissy
 */
public class Lat2Modul31811082027 {
    public static Player player;

    public void serialize1811082027(ArrayList<Lat1Modul1811082027>tampung1811082027,String path){
        try (ObjectOutputStream out1811082027=new ObjectOutputStream(new FileOutputStream(path))){
            out1811082027.writeObject(tampung1811082027);
            out1811082027.close();
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        String nilai_huruf = null;
        String status = null;
        Lat2Modul31811082027 sa1811082027 = new Lat2Modul31811082027();
        ArrayList<Lat1Modul1811082027>tampung1811082027;
        tampung1811082027=new ArrayList<Lat1Modul1811082027>();
        String path1811082027 = "file1811082027/Lat2Modul3.txt";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu\t:");
        System.out.println("1.Tambah");
        System.out.println("2.Exit");
        
        System.out.print("pilihan : ");
        int pilihan = scanner.nextInt();
        
         switch (pilihan){
                case 1 : {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Nama = ");
                    String nama =scanner1.nextLine();
                    System.out.print("NoBp = ");
                    String nobp = scanner1.nextLine();
                    System.out.print("Mata Kuliah = ");
                    String matakuliah = scanner1.nextLine();
                    System.out.print("Nilai = ");
                    double nilai = scanner1.nextDouble();
                    
                    if(nilai>=85){
                        nilai_huruf="A";
                        status="Lulus";
                        
                    }
                        else if (nilai>=80 && nilai<85){
                        nilai_huruf="A-";
                        status="Lulus";
                    }
                        else if (nilai>=70 && nilai<80){
                        nilai_huruf="B+";
                        status="Lulus";
                    }
                        else if (nilai>=60 && nilai<70){
                        nilai_huruf="B";
                        status="Lulus";
                    }
                        else if (nilai>=50 && nilai<60){
                        nilai_huruf="C+";
                         status="Gagal";
                    }
                    else if (nilai>=40 && nilai<50){
                        nilai_huruf="C-";
                         status="Gagal";
                    }
                    else if (nilai<40){
                        nilai_huruf="D";
                         status="Gagal";
                    }
                    tampung1811082027.add(new Lat1Modul1811082027(nama, nobp, matakuliah, nilai,nilai_huruf,status));
                    sa1811082027.serialize1811082027(tampung1811082027, path1811082027);
                   
                    System.out.println("================================================");
                    System.out.println("Nama\t\t:"+nama);
                    System.out.println("NoBp\t\t:"+nobp);
                    System.out.println("Mata Kuliah\t:"+matakuliah);
                    System.out.println("Nilai\t\t:"+nilai);
                    System.out.println("Nilai Huruf\t:"+nilai_huruf);
                    System.out.println("Status\t\t:"+status);
                    System.out.println("================================================");
                    
                    if (status == "Lulus") {
                         path1811082027 = "file1811082027/Lulus.mp3";
                        FileInputStream fis1811082027 = new FileInputStream(path1811082027);
                        BufferedInputStream bis1811082027 =new BufferedInputStream(fis1811082027);
                        player=new Player(bis1811082027);

                         new Thread(){
                            public void run(){
                                try {
                                    player.play();
                                } catch (Exception ex) {
                                    System.err.println("Error"+ex);
                                }
                            }
                        }.start();
                        
                    }else {
                         path1811082027 = "file1811082027/Gagal.mp3";
                        FileInputStream fis1811082027 = new FileInputStream(path1811082027);
                        BufferedInputStream bis1811082027 =new BufferedInputStream(fis1811082027);
                        player=new Player(bis1811082027);

                         new Thread(){
                            public void run(){
                                try {
                                    player.play();
                                } catch (Exception ex) {
                                    System.err.println("Error"+ex);
                                }
                            }
                        }.start();
                        
                    }
                    
                    break;
                    
                    
                }
                case 2 : {
                    System.out.println("proses selesai..");
                    break;
                    
                }
                
                default:
                    System.out.println("Pilihan anda salah..");
 
            }
    }
    
}
