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
public class ExtendThread_1811082027 extends Thread{
    int threadNumber;

    public ExtendThread_1811082027(int num) {
        threadNumber = num;
    }
    
    public void run(){
        System.out.println("I'm tread number : "+ threadNumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(threadNumber+"is finished!");
        }
        System.out.println(threadNumber+" is finished!!");
    }
    
    public static void main(String[] args) {
        System.out.println("Creating thread 1");
        Thread t1 = new ExtendThread_1811082027(1);
        
        System.out.println("Creating thread 2");
        Thread t2 = new ExtendThread_1811082027(2);
        
        t1.start();
        t2.start();
    }
    
    
    
}
