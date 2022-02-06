package com.company.Assignment2;

import org.jetbrains.annotations.NotNull;

public class Trader implements Comparable<Trader> {
    private String firstName;
    private String lastName;
    private String phone;
    private String walletAddress;
    private double profit;
private  TraderTransactionDetails traderTransactionDetails;

    public TraderTransactionDetails getTraderTransactionDetails() {
        return traderTransactionDetails;
    }

    public double getProfit() {
        return profit;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setProfit(double profit) throws Exception {
        this.profit = this.traderTransactionDetails.getNetProfit();
    }

    public Trader(String firstName, String lastName, String phone, String walletAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.walletAddress = walletAddress;
        this.profit = 0;
        this.traderTransactionDetails=new TraderTransactionDetails();
    }

    @Override
    public String toString() {
        return "Trader{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", walletAddress='" + walletAddress + '\'' +
                '}';
    }
    @Override
    public int compareTo(@NotNull Trader o) {
        if (this.getProfit() < o.getProfit())
            return 1;
        else if (this.getProfit() == o.getProfit())
            return 0;
        else
            return -1;
    }
}
