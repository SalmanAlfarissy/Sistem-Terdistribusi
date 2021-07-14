/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_1811082027;

import java.io.IOException;

/**
 *
 * @author Salman Alfarissy
 */
public class waitress_1811082027 extends Thread{
    public static void main(String[] args) throws InterruptedException {
        int count_2027 = 0;
        
        Thread notifyThread_2027 = new waitress_1811082027();
        notifyThread_2027.start();
        
        Counter_1811082027 myCounter_2027= new Counter_1811082027();
        
        Runnable runner_2027 = new chef_1811082027(myCounter_2027, 10);
        Thread t1 = new Thread(runner_2027);
        t1.start();
        System.out.print("");
        t1.join();
        System.out.println("");
        System.out.println("Total Pesanan "+myCounter_2027.getCount());
        System.out.println("-----------------------------");
        System.out.println("Pelayan mengantarkan Makanan (Tekan Enter Jika Pesanan telah Selesai)");
        
        synchronized(notifyThread_2027){
            notifyThread_2027.wait();
        }
        
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Pesanan Selesai");
    }

    @Override
    public void run() {
        System.out.println("Chef sedang membuat makanan sesuai pesanan");
        System.out.println("------------------------------------------");
        try{
            System.in.read();
        } catch(IOException ioe){
            
        }
        
        synchronized(this){
            this.notifyAll();
        }
    }
    
}
