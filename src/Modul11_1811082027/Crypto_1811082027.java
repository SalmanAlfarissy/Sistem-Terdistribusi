/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul11_1811082027;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author RyderPhantom
 */
public class Crypto_1811082027 {
    private static Cipher cipher_2027 = null;
    
    public static void main(String[] args) throws Exception{
        KeyGenerator keyGenerator_2027 = KeyGenerator.getInstance("DESede");
        
        keyGenerator_2027.init(168);
        SecretKey secretKey_2027 = keyGenerator_2027.generateKey();
        cipher_2027 = Cipher.getInstance("DESede");
        
        String plainTxt_2027 = "Kriptografi menggunakan Java Cryptography Extension";
        System.out.println("Plain Text Before Encryption : "+plainTxt_2027);
        
        byte[] plainTextByte_2027 = plainTxt_2027.getBytes("UTF8");
        
        byte[] encryptedBytes_2027 = encrypt(plainTextByte_2027, secretKey_2027);
        String encryptedText_2027 = new String(encryptedBytes_2027, "UTF8");
        System.out.println("Plain Text After Encryption : "+ encryptedText_2027);
        
        byte[] decryptedBytes_2027 = decrypt(encryptedBytes_2027, secretKey_2027);
        String decryptedText_2027 = new String(decryptedBytes_2027, "UTF8");
        System.out.println("Plain Text After Decryption : "+decryptedText_2027);
    }
    
    static byte[] encrypt(byte[] plainText, SecretKey key) throws Exception{
        cipher_2027.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes_2027 = cipher_2027.doFinal(plainText);
        return encryptedBytes_2027;
    }
    
    static byte[] decrypt(byte[] encryptedText, SecretKey key) throws Exception{
        cipher_2027.init(cipher_2027.DECRYPT_MODE, key);
        byte[] decryptedBytes_2027 = cipher_2027.doFinal(encryptedText);
        return decryptedBytes_2027;
    }
}
