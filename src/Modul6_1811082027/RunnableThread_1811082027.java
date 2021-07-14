/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6_1811082027;

/**
 *
 * @author Salman Alfarissy
 */
public class RunnableThread_1811082027 implements Runnable{

    @Override
    public void run() {
        System.out.println("I am an instance of the java.lang.rinnable interface");
    }
    
    public static void main(String[] args) {
        System.out.println("Creating runnable object");
        
        Runnable run = (Runnable) new RunnableThread_1811082027();
        
        System.out.println("Creating first thread");
        Thread t1 = new Thread(run);
        
        System.out.println("Creating second thread");
        Thread t2 = new Thread(run);
        
        System.out.println("Starting both thread");
        t1.start();
        t2.start();
        
    }
    
    
}
