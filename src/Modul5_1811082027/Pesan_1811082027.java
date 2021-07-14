/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811082027;

import java.io.Serializable;

/**
 *
 * @author Salman Alfarissy
 */
class Pesan_1811082027 implements Serializable{
    private String Nama;
    private String Pesan;

    public Pesan_1811082027(String Nama, String Pesan) {
        this.Nama = Nama;
        this.Pesan = Pesan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getPesan() {
        return Pesan;
    }

    public void setPesan(String Pesan) {
        this.Pesan = Pesan;
    }
    
    

    
    
    
    
}
