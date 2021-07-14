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
public class Counter_1811082027 {
    private int countValue;
    
    public Counter_1811082027() {
        countValue = 0;
    }
        
    public Counter_1811082027(int start) {
        countValue = start;
    }

    
    public synchronized void increaseCount() {
        int count = countValue;
        try {
            Thread.sleep(5);
        } catch (InterruptedException ie) {
        }
        count = count + 1;
        countValue = count;
    }
    public synchronized int getCount(){
        return countValue;
    }
    
    
}
