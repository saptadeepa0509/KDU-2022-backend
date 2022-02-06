package com.company.Assignment2;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class TransactionDetails {
    private HashMap<String, Coin> coinDetails;
    private HashMap<ArrayList<String>, Trader> traderDetails;
    private ArrayList<Coin> coins;
    private ArrayList<Trader> traders;
    private HashMap<String,Trader>traderDetails_;

    public TransactionDetails() throws Exception {
        coinDetails=new HashMap<>();
        traderDetails=new HashMap<>();
        traderDetails_=new HashMap<>();
        coins = new CoinDetails().getAllCoins();
        traders = new TraderDetail().getAllTraders();
        for (Coin coin : coins) {
            coinDetails.put(coin.getName(), coin);
            coinDetails.put(coin.getSymbol(), coin);
        }
        for (Trader trader : traders) {
            ArrayList<String> name = new ArrayList<String>();
            name.add(trader.getFirstName().toLowerCase());
            name.add(trader.getLastName().toLowerCase());
            traderDetails.put(name, trader);
            traderDetails_.put(trader.getWalletAddress(),trader);
        }
    }

    public Coin getCoinDetails(String code) {
        if (coinDetails.containsKey(code)) {
            return (coinDetails.get(code));
        } else {
            return null;
        }
    }

    public void displayTopCoin(int n) {
        Collections.sort(coins);
        for (int i = 0; i < n; i++) {
            System.out.println(coins.get(i));
        }

    }

    public void displayPortfolio(@NotNull String firstName, @NotNull String lastName) {
        ArrayList<String> name = new ArrayList<String>();
        name.add(firstName.toLowerCase());
        name.add(lastName.toLowerCase());
        if (traderDetails.containsKey(name)) {
            System.out.println(traderDetails.get(name).getFirstName() + " " + traderDetails.get(name).getLastName());
            System.out.print("Trader phone_no :");
            System.out.println(traderDetails.get(name).getPhone());
            System.out.print("Trader Wallet_Address :");
            System.out.println(traderDetails.get(name).getWalletAddress());
        } else {
            System.out.println("no such trader found");
        }

    }

    public void displayNetValue(@NotNull String firstName, @NotNull String lastName) {

        ArrayList<String> name = new ArrayList<String>();
        name.add(firstName.toLowerCase());
        name.add(lastName.toLowerCase());
        if (traderDetails.containsKey(name)) {
            float profit = (float) traderDetails.get(name).getProfit();
            if (profit >= 0)
                System.out.println("Profit :" + profit);
            else
                System.out.println("Loss :" + (profit) * (-1));
        } else {
            System.out.println("no such trader found");
        }
    }

    public void displayTopN(int n) {
        Collections.sort(traders);
        for (int i = 0; i < n; i++) {
            System.out.println(traders.get(i));
        }
    }

    public void displayBottomN(int n) {
        Collections.sort(traders);
        for (int i = traders.size() - 1; i >= traders.size() - n; i--) {
            System.out.println(traders.get(i));
        }
    }
    public Trader getTrader(String walletAddress){
        return traderDetails_.containsKey(walletAddress)==true?traderDetails_.get(walletAddress):null;
    }
}
