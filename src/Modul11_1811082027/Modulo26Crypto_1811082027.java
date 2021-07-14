/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul11_1811082027;

/**
 *
 * @author RyderPhantom
 */
public class Modulo26Crypto_1811082027 {
    public static void main(String[] args) {
        String plainText_2027 = "SISTER";
        String secretKey_2027 = "SECRETKEY";
        System.out.println("Plain Text Before Encryption\t: "+plainText_2027);
        String encryptedText_2027 = encrypt(plainText_2027, secretKey_2027);
        System.out.println("Encrypted Text After Encryption\t: "+encryptedText_2027);
        String decryptedText_2027 = decrypt(encryptedText_2027, secretKey_2027);
        System.out.println("Decrypted Text After Decryption\t: "+decryptedText_2027);
    }
    
    private static String encrypt(String str, String key){
        StringBuilder encryptedString_2027 = new StringBuilder();
        int encryptedInt_2027;
        for(int i=0; i<str.length(); i++){
            int strInt_2027 = (int)(str.charAt(i) - 'A');
            int keyInt_2027 = (int)(key.charAt(i) - 'A');
            encryptedInt_2027 = (strInt_2027+keyInt_2027)%26;
            encryptedString_2027.append((char) (encryptedInt_2027 + (int) 'A'));
        }
        return encryptedString_2027.toString();
    }
    
    private static String decrypt(String str, String key){
        StringBuilder decryptedString_2027 = new StringBuilder();
        int decryptedInt_2027;
        for(int i=0; i<str.length(); i++){
            int strInt_2027 = (int) (str.charAt(i) - 'A');
            int keyInt_2027 = (int) (key.charAt(i) - 'A');
            decryptedInt_2027 = strInt_2027 - keyInt_2027;
            if(decryptedInt_2027<0){
                decryptedInt_2027+=26;
            }
            decryptedString_2027.append((char) (decryptedInt_2027 + (int) 'A'));
        }
        return decryptedString_2027.toString();
    }
}
