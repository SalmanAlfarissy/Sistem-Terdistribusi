/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul11_1811082027;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author RyderPhantom
 */
public class AESExample_1811082027 {
    static Cipher cipher_2027;
    
    public static void main(String[] args) throws Exception{
        KeyGenerator keyGenerator_2027 = KeyGenerator.getInstance("AES");
        keyGenerator_2027.init(128);
        SecretKey secretKey_2027 = keyGenerator_2027.generateKey();
        cipher_2027 = Cipher.getInstance("AES");
        
        String plainTxt_2027 = "AES symmetric Encryption Decryption";
        System.out.println("Plain Text Before Encryption : "+plainTxt_2027);
        
        String encryptedText_2027 = encrypt(plainTxt_2027, secretKey_2027);
        System.out.println("Plain Text After Encryption : "+ encryptedText_2027);
        
        String decryptedText_2027 = decrypt(encryptedText_2027, secretKey_2027);
        System.out.println("Plain Text After Decryption : "+decryptedText_2027);
    }

    public static String encrypt(String plainTxt, SecretKey key) throws Exception{
        byte[] plainTextBytes_2027 = plainTxt.getBytes();
        cipher_2027.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedByte_2027 = cipher_2027.doFinal(plainTextBytes_2027);
        Base64.Encoder encoder_2027 = Base64.getEncoder();
        String encryptedText_2027 = encoder_2027.encodeToString(encryptedByte_2027);
        return encryptedText_2027;
    }

    public static String decrypt(String encryptedText, SecretKey key) throws Exception{
        Base64.Decoder decoder_2027 = Base64.getDecoder();
        byte[] encryptedTextBytes_2027 = decoder_2027.decode(encryptedText);
        cipher_2027.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedByte_2027 = cipher_2027.doFinal(encryptedTextBytes_2027);
        String decryptedText_2027 = new String(decryptedByte_2027);
        return decryptedText_2027;
    }
    
    
}
