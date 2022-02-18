package com.company.Assignment2;

import java.io.*;
import java.util.ArrayList;

public class TraderDetail  {
    private ArrayList<Trader> allTraders;

    public TraderDetail() throws Exception{
        allTraders = new ArrayList<Trader>();
        try {
            File file = new File("/home/saptadeepa/KDU-2022-backend/BTC/Resources/traders.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] individualField;
            while ((line = br.readLine()) != null) {
                while ((line = br.readLine()) != null) {
                    individualField = line.split(",");
                    String firstName = individualField[1];
                    String lastName = individualField[2];
                    String phone = individualField[3];
                    String walletAddress = individualField[4];
                    allTraders.add(new Trader(firstName, lastName, phone, walletAddress));

                }
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        catch (NullPointerException e){
            System.out.println("Null pointer exception ");
        }
    }

    public ArrayList<Trader> getAllTraders() {
        return allTraders;
    }
}

