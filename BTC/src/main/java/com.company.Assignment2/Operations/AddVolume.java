package com.company.Assignment2.Operations;

import com.company.Assignment2.TransactionDetails;

public class AddVolume extends Thread {
    private String coin;
    private long volume;

    public AddVolume(String coin, long volume) {
        this.coin = coin;
        this.volume= volume;
    }

    @Override
    public void run() {
        try {
            TransactionDetails transactionDetails=new TransactionDetails();
            if(transactionDetails.getCoinDetails(coin)!=null )
            transactionDetails.getCoinDetails(coin).add(volume);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
