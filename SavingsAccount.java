package com.exo5;

import com.exo4.Account;
import com.exo4.Customer;

public class SavingsAccount extends Account{
    private String  interest;

    public SavingsAccount(Account account1, Customer customer, String interest) {
        super(account1, customer);
        this.interest = interest;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "SavingsAccount [interest=" + interest + "]";
    }

}
