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
public class WaitingThreadDead_1811082027 extends Thread{
    public void run(){
        System.out.println("This thread feels a little ill.....");
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread dying = new WaitingThreadDead_1811082027();
        dying.start();
        
        System.out.println("Waiting for thread death");
        
        dying.join();
        System.out.println("Thread has died");
    }
    
}
