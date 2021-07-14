/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811082027;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Salman Alfarissy
 */
public class Participant1811082027 implements Serializable{
    private String firstName;
    private String lastName;
    private int age;

    public Participant1811082027(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private Participant1811082027() {
       
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    public void printData_1811082027(){
        System.out.println("Name\t:"+firstName+" "+ lastName);
        System.out.println("Usia\t:"+age);
    }
    
//    Proses Serialization
    public void saveObject1811082027(Participant1811082027 Obj1811082027){
        try (FileOutputStream fos1811082027=new FileOutputStream("file1811082027/Object1811082027.txt")){
            ObjectOutputStream oos1811082027 = new ObjectOutputStream(fos1811082027);
            oos1811082027.writeObject(Obj1811082027);
            oos1811082027.flush();
            fos1811082027.close();
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    
//    proses Deserialization
    public void readObject1811082027(Participant1811082027 Obj1811082027){
        try (FileInputStream fis1811082027 = new FileInputStream("file1811082027/Object1811082027.txt")){
            ObjectInputStream ois1811082027 = new ObjectInputStream(fis1811082027);
            Obj1811082027 = (Participant1811082027) ois1811082027.readObject();
            Obj1811082027.printData_1811082027();
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    
    public static void main(String[] args) {
//        cara pertama
//        Participant1811082027 is1811082027 = new Participant1811082027("Salman", "Alfarissy", 21);
//        is1811082027.saveObject1811082027(is1811082027);
//        is1811082027.readObject1811082027(is1811082027);
        
//        cara ke 2
        Participant1811082027 is1811082027 = new Participant1811082027();
        is1811082027.setFirstName("Salman");
        is1811082027.setLastName("Alfarissy");
        is1811082027.setAge(18);
        
        is1811082027.saveObject1811082027(is1811082027);
        is1811082027.readObject1811082027(is1811082027);
    }
    
    
    
}
