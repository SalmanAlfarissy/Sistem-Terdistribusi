/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811082027;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 *
 * @author Salman Alfarissy
 */
public class Image1811082027 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Image image1811082027 = null;
        File Source1811082027=new File("file1811082027/hallo.jpg");
        image1811082027=ImageIO.read(Source1811082027);
        
        InputStream is1811082027 = new BufferedInputStream(new FileInputStream(Source1811082027));
        image1811082027=ImageIO.read(is1811082027);
        
        JFrame frame1811082027=new JFrame();
        JLabel label= new JLabel(new ImageIcon(image1811082027));
        frame1811082027.getContentPane().add(label,BorderLayout.CENTER);
        frame1811082027.setTitle("Hallo Image");
        frame1811082027.pack();
        frame1811082027.setVisible(true);
    }
    
    
    
}
