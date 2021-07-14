/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_1811082027;

/**
 *
 * @author Salman Alfarissy
 */
public class WaitNotify_1811082027 extends Thread{
    public static void main(String[] args) throws Exception {
        Thread notificationThread = new WaitNotify_1811082027();
        notificationThread.start();
        
        synchronized (notificationThread){
            notificationThread.wait();
        }
        
        System.out.println("The wait is over");
    }
    
    public void run(){
        System.out.println("Hit enter to stop waiting thread");
        try {
            System.in.read();
        } catch (java.io.IOException e) {
        }
        synchronized (this){
            this.notifyAll();
        }
    }
    
}
