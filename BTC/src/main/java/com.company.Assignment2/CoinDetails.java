package com.company.Assignment2;

import java.io.*;
import java.util.ArrayList;

public class CoinDetails {
    private ArrayList<Coin> allCoins;

    public CoinDetails(){
        allCoins = new ArrayList<Coin>();

        try {
            File file = new File("/home/saptadeepa/KDU-2022-backend/BTC/Resources/coins.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] individualField;
            while ((line = br.readLine()) != null) {
                while ((line = br.readLine()) != null) {
                    individualField = line.split(",");
                    int rank = Integer.parseInt(individualField[1]);
                    String name = individualField[2];
                    String symbol = individualField[3];
                    float price = Float.parseFloat(individualField[4]);
                    long circulatingSupply = Long.parseLong(individualField[5]);
                    allCoins.add(new Coin(rank, name, symbol, price, circulatingSupply));

                }
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public ArrayList<Coin> getAllCoins() {
        return allCoins;
    }
}

