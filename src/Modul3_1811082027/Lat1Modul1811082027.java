/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811082027;

import static Modul2_1811082027.AudioMP31811082027.player;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Salman Alfarissy
 */
public class Lat1Modul1811082027 implements Serializable{
    private String nama;
    private String nobp;
    private String matakuliah;
    private double nilai;
    private String nilai_huruf;
    private String status;
    public static Player player;

    public Lat1Modul1811082027(String nama, String nobp, String matakuliah, double nilai,String nilai_huruf,String status) {
        this.nama = nama;
        this.nobp = nobp;
        this.matakuliah = matakuliah;
        this.nilai = nilai;
        this.nilai_huruf = nilai_huruf;
        this.status = status;
    }

    
    
    public void printData_1811082027(){
        System.out.println("================================================");
        System.out.println("Nama\t:"+nama);
        System.out.println("NoBp\t:"+nobp);
        System.out.println("Mata Kuliah\t:"+matakuliah);
        System.out.println("Nilai\t:"+nilai);
        System.out.println("================================================");
    }
    
//    Proses Serialization
    public void saveObject1811082027(Lat1Modul1811082027 Obj1811082027){
        try (FileOutputStream fos1811082027=new FileOutputStream("file1811082027/Lat1Modul3.txt")){
            ObjectOutputStream oos1811082027 = new ObjectOutputStream(fos1811082027);
            oos1811082027.writeObject(Obj1811082027);
            oos1811082027.flush();
            fos1811082027.close();
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    
//    proses Deserialization
    public void readObject1811082027(Lat1Modul1811082027 Obj1811082027){
        try (FileInputStream fis1811082027 = new FileInputStream("file1811082027/Lat1Modul3.txt")){
            ObjectInputStream ois1811082027 = new ObjectInputStream(fis1811082027);
            Obj1811082027 = (Lat1Modul1811082027) ois1811082027.readObject();
            Obj1811082027.printData_1811082027();
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nama = ");
        String nama = scanner.nextLine();
        System.out.print("NoBp = ");
        String nobp = scanner.nextLine();
        System.out.print("Mata Kuliah = ");
        String matakuliah = scanner.nextLine();
        System.out.print("Nilai = ");
        double nilai = scanner.nextDouble();
        Lat1Modul1811082027 is1811082027 = new Lat1Modul1811082027(nama,nobp,matakuliah,nilai,"","");
        is1811082027.saveObject1811082027(is1811082027);
        is1811082027.readObject1811082027(is1811082027);
        
        String path1811082027 = "file1811082027/AUDIO.mp3";
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
    
}
