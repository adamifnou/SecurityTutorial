package com.example.demo;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.util.Base64;

public class ECDSAKeyGenerator {
//    public static void main(String[] args) {
//        try {
//            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
//            keyGen.initialize(256);
//            KeyPair keyPair = keyGen.generateKeyPair();
//            PrivateKey privateKey = keyPair.getPrivate();
//            String base64PrivateKey = Base64.getEncoder().encodeToString(privateKey.getEncoded());
//            System.out.println("Base64 Encoded ECDSA Private Key: " + base64PrivateKey);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
public static void main(String[] args) {
    try {
        // Option 1: Use a predefined secret key (simple string)
        String secretKeyString = "mySuperSecretKey";
        System.out.println("Secret Key (String): " + secretKeyString);

        // Option 2: Generate a random secret key
        KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
        SecretKey secretKey = keyGen.generateKey();
        String base64SecretKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        System.out.println("Base64 Encoded HS256 Secret Key: " + base64SecretKey);

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}