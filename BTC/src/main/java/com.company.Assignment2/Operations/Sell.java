package com.company.Assignment2.Operations;

import com.company.Assignment2.TransactionDetails;

public class Sell extends Thread{
    private String coin;
    private String walletAddress;
    private long quantity;

    public Sell(String coin, String walletAddress, long quantity) {
        this.coin = coin;
        this.walletAddress = walletAddress;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        try {
            TransactionDetails transactionDetails=new TransactionDetails();
            if(transactionDetails.getCoinDetails(coin)!=null &&transactionDetails.getTrader(walletAddress)!=null )
            transactionDetails.getCoinDetails(coin).sell(transactionDetails.getTrader(walletAddress),quantity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
