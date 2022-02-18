package com.company.Assignment2;
import java.util.HashMap;
import java.util.Map;

public class TraderTransactionDetails {

    private Map<String, Long> netCapaacity ;
    public TraderTransactionDetails() {
        netCapaacity = new HashMap<>();
    }

    public Map<String, Long> getNetCapaacity() {
        return netCapaacity;
    }

    public synchronized void setNetCapaacity(String coin, long capacity) {
        try {
            this.netCapaacity.put(coin, this.netCapaacity.containsKey(coin) == true ? this.netCapaacity.get(coin) + capacity : capacity);
        }catch (Exception e){
            System.out.println("Error"+e);
        }
    }

    public synchronized long findCount(String code) {
        try {
            if (netCapaacity.containsKey(code) == true) return ((long) netCapaacity.get(code));

        return 0;}
        catch (Exception e){
            return 0;
        }

    }

    public double getNetProfit() throws Exception {
        TransactionDetails user = new TransactionDetails();
        double profit = 0;
        for (Map.Entry<String, Long> details : netCapaacity.entrySet()) {
            profit += details.getValue() * user.getCoinDetails(details.getKey()).getPrice();
        }
        return profit;
    }
}


