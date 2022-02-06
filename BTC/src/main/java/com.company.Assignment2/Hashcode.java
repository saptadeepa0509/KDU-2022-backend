package com.company.Assignment2;

import java.util.Random;

public class Hashcode {
    /**
     * Method generates the unique block hash required
     * for transactions made using the cryptocurrencies
     * @return - string representing the transaction hashcode
     */
    public static void  getBlockHash() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder transactionHash = new StringBuilder();
        Random rnd = new Random();
/**
 * Introducing delay mimicking complex
 * calculation being performed.
 */
        for(double i=0;i<199999999; i++){
            i = i;
        }
        while (transactionHash.length() < 128) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            transactionHash.append(SALTCHARS.charAt(index));
        }
        String hashCode = transactionHash.toString();
       // return "0x" + hashCode.toLowerCase();
    }
}
