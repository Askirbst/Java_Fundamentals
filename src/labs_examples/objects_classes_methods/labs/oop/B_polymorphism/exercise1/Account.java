package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.exercise1;

import java.util.Scanner;

public class Account implements Withdraws{
    //variable 'balance' holds the value of balance before interest
    //variable 'currentBalance' holds the value of balance after interest and potential withdraws
    protected double balance;
    protected double currentBalance;

    public Account(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void debit() {
    }

    @Override
    public void interestGained(){

    }
}