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
public class chef_1811082027 implements Runnable{
    
     Counter_1811082027 myCounter_2027;
    int countAmount_2027;

    public chef_1811082027(Counter_1811082027 myCounter_2027, int countAmount_2027) {
        this.myCounter_2027 = myCounter_2027;
        this.countAmount_2027 = countAmount_2027;
    }

    @Override
    public void run() {
        for (int i = 1; i < countAmount_2027; i++) {
            myCounter_2027.increaseCount();
            System.out.println("Pesanan "+myCounter_2027.getCount()+" telah selesai");
        }
    }
    
}
