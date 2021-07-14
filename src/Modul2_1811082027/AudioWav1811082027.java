/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811082027;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


/**
 *
 * @author Salman Alfarissy
 */
public class AudioWav1811082027 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pathAudioWav1811082027 = "file1811082027/bell.wav";
        InputStream in1811082027 = new FileInputStream(pathAudioWav1811082027);
        AudioStream audioStream1811082027 = new AudioStream(in1811082027);
        AudioPlayer.player.start(audioStream1811082027);
        
        
    }
}
