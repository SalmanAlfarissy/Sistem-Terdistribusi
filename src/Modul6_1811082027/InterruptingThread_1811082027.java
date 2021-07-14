/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6_1811082027;

import java.io.IOException;

/**
 *
 * @author Salman Alfarissy
 */
public class InterruptingThread_1811082027 extends Thread{
    
    public void run(){
        System.out.println("I feel sleepy.wake me in eight hourse");
        try {
            Thread.sleep(1000 * 60 * 60 * 8);
            System.out.println("that was a nice nap");
        } catch (InterruptedException e) {
            System.err.println("just five more minutes...");
        }
    }
    
    public static void main(String[] args) throws IOException {
        Thread sleepy = new InterruptingThread_1811082027();
        
        sleepy.start();
        
        System.out.println("Press Enter to Interrupt the thread");
        
        System.in.read();
        
        sleepy.interrupt();
    }
    
}
