/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811082027;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author Salman Alfarissy
 */
public class AudioMP31811082027 {
    public static Player player;
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        String path1811082027 = "file1811082027/AUDIO.mp3";
        FileInputStream fis1811082027 = new FileInputStream(path1811082027);
        BufferedInputStream bis1811082027 =new BufferedInputStream(fis1811082027);
        player=new Player(bis1811082027);
        
         new Thread(){
            public void run(){
                try {
                    player.play();
                } catch (Exception ex) {
                    System.err.println("Error"+ex);
                }
            }
        }.start();
        
    }
}
