package com.company.Assignment2.Operations;

import com.company.Assignment2.TransactionDetails;

public class UpdatePrice extends Thread {
    private String coin;
    private double price;

    public UpdatePrice(String coin, double price) {
        this.coin = coin;
        this.price= price;
    }

    @Override
    public void run() {
        try {
            TransactionDetails transactionDetails=new TransactionDetails();
            if(transactionDetails.getCoinDetails(coin)!=null )
                transactionDetails.getCoinDetails(coin).updatePrice(price);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
