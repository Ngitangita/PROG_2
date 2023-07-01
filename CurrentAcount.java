package com.exo5;

import com.exo4.Account;
import com.exo4.Customer;

public class CurrentAcount extends Account{
    private double negatifPay;

    public CurrentAcount(Account account1, Customer customer) {
        super(account1, customer);
        //TODO Auto-generated constructor stub
        this.negatifPay = negatifPay;
    }

    public CurrentAcount(int accountNumber, Customer customer, double negatifPay) {
        super(accountNumber, customer);
        this.negatifPay = 0;
    }

    public double getNegatifPay() {
        return negatifPay;
    }

    public void setNegatifPay(double negatifPay) {
        this.negatifPay = negatifPay;
    }

    @Override
    public String toString() {
        return "CurrentAcount [negatifPay=" + negatifPay + "]";
    }

}
