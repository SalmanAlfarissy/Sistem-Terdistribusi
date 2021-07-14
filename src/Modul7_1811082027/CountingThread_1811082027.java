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
public class CountingThread_1811082027 implements Runnable{
    
    Counter_1811082027 myCounter;
    int countAmount;
    
    public CountingThread_1811082027(Counter_1811082027 counter, int amount){
        myCounter = counter;
        countAmount = amount;
    }
   
    public void run() {
        for (int i = 1; i <= countAmount; i++) {
            myCounter.increaseCount();
            System.out.print(" "+myCounter.getCount());
            
        }
    }
    
    public static void main(String[] args) throws Exception {
  
        Counter_1811082027 c = new Counter_1811082027();
        
        Runnable runner = new CountingThread_1811082027(c, 10);
        System.out.println("Starting counting threads");
        Thread t1 = new Thread(runner);
        Thread t2 = new Thread(runner);        
        Thread t3 = new Thread(runner);
        
        t1.start(); 
        t2.start(); 
        t3.start();
        
        t1.join(); 
        t2.join(); 
        t3.join();
        
        System.out.println("\nCounter value is " + c.getCount());
        
        
    }
    
}
