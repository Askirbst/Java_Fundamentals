package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.exercise1;

import java.util.Scanner;

class SavingsAccount extends Account implements Withdraws {
    protected double overdraftLimit;
    protected double interest;

    public SavingsAccount(double balance, double overdraftLimit, double interest) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
        this.interest = interest;
        currentBalance = (balance + (balance * interest));
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public void debit() {
        Scanner scn = new Scanner(System.in);
        double withdraw = scn.nextDouble();
        if (withdraw > overdraftLimit + balance) {
            System.err.println("Overdraft Alert");
        } else
            System.out.println("You have withdrawn in the amount of: " + withdraw + " dollars. " +
                    "\n" + "Your current balance is: " + (currentBalance - withdraw));
        balance = (currentBalance - withdraw);
    }
    @Override
    public void interestGained(){
        System.out.println("Interest on account is: " + interest);
        System.out.println("Current balance on account is: " + (balance + (balance * interest)));
        currentBalance = (balance + (balance * interest));
    }

}
