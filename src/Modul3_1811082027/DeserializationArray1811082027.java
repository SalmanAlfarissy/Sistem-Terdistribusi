/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811082027;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import static java.lang.System.in;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Salman Alfarissy
 */
public class DeserializationArray1811082027 {
    public static void main(String[] args){
        DeserializationArray1811082027 deserialization1811082027 = new DeserializationArray1811082027();
        System.out.println("Deserialization Object");
        ArrayList<Participant1811082027> newList = deserialization1811082027.deserialization("file1811082027/ObjectArray1811082027.txt");
        for (Participant1811082027 p : newList) {
            System.out.println("Nama Depan\t\t:"+p.getFirstName()+
                    "\nNama Belakang\t\t:"+p.getLastName()+
                    "\nUmur\t\t\t:"+p.getAge());
            System.out.println("=======================================");
            
        }
    }

    public ArrayList<Participant1811082027> deserialization(String path1811082027) {
        ArrayList<Participant1811082027> pcList = null;
        try (ObjectInputStream ois1811082027 = new ObjectInputStream(new FileInputStream(path1811082027))){
            pcList=(ArrayList<Participant1811082027>) ois1811082027.readObject();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error"+e.getMessage());
        }
        return pcList;
    }
    
}
