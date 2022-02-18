package com.company.Assignment2;

import com.company.Assignment2.Hashcode;

public class Coin implements Comparable<Coin> {

    private int rank;
    private String name;
    private String symbol;
    private float price;
    private long circulatingSupply;

    public Coin(int rank, String name, String symbol, float price, long circulatingSupply) {
        this.rank = rank;
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.circulatingSupply = circulatingSupply;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public float getPrice() {
        return price;
    }

    public long getCirculatingSupply() {
        return circulatingSupply;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", price=" + price +
                ", circulatingSupply=" + circulatingSupply +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        if (this.getPrice() < o.getPrice())
            return 1;
        else if (this.getPrice() == o.getPrice())
            return 0;
        else
            return -1;

    }

    synchronized public void buy(Trader trader, long quantity) throws InterruptedException {
        try{
        while (circulatingSupply < quantity)
            wait();
        Hashcode.getBlockHash();
        circulatingSupply = circulatingSupply - quantity;
        trader.getTraderTransactionDetails().setNetCapaacity(symbol, quantity);}
        catch (Exception e){
            System.out.println("Exception"+e);
        }

    }

    synchronized public void sell(Trader trader, long quantity) {
        try{
        if (trader.getTraderTransactionDetails().findCount(symbol) >= quantity) {
            Hashcode.getBlockHash();
            circulatingSupply = circulatingSupply + quantity;
            trader.getTraderTransactionDetails().setNetCapaacity(symbol, (-1) * quantity);
            notifyAll();
        }}
        catch (Exception e){
            System.out.println("Exception"+e);
        }
    }

    synchronized public void add(long volume) {
        Hashcode.getBlockHash();
        circulatingSupply = circulatingSupply + volume;
        notifyAll();
    }

    synchronized public void updatePrice(double price) {
        Hashcode.getBlockHash();
        this.price= (float) price;
    }
}
