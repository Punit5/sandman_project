package com.hotels.bean;

/**
 * Created by Punit on 2018-10-23.
 */
public class TotalPrice implements Comparable<TotalPrice> {

    private double amount;

    private String currency;

    public TotalPrice() {
    }

    public TotalPrice(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TotalPrice that = (TotalPrice) o;

        if (Double.compare(that.amount, amount) != 0) return false;
        return currency != null ? currency.equals(that.currency) : that.currency == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(amount);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(TotalPrice o) {
        if (this.getAmount() < o.getAmount()) return -1;
        else if (this.getAmount() > o.getAmount()) return 1;
        else return 0;
    }
}
