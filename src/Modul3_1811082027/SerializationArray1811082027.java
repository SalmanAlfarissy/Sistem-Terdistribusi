/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811082027;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Salman Alfarissy
 */
public class SerializationArray1811082027 {
    public void serialize1811082027(ArrayList<Participant1811082027>tampung1811082027,String path){
        try (ObjectOutputStream out1811082027=new ObjectOutputStream(new FileOutputStream(path))){
            out1811082027.writeObject(tampung1811082027);
            out1811082027.close();
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    
    public static void main(String[] args) {
        SerializationArray1811082027 sa1811082027 = new SerializationArray1811082027();
        ArrayList<Participant1811082027>tampung1811082027;
        
        tampung1811082027=new ArrayList<Participant1811082027>();
        String path1811082027 = "file1811082027/ObjectArray1811082027.txt";
        
        tampung1811082027.add(new Participant1811082027("Salman", "Alfarissy", 21));
        tampung1811082027.add(new Participant1811082027("Paxia", "Ramadhani", 24));
        tampung1811082027.add(new Participant1811082027("Masyitah", " ", 21));
        sa1811082027.serialize1811082027(tampung1811082027, path1811082027);
        
        
    }
    
}
