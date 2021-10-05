package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.exercise1;

public class Bank implements Withdraws{

    public static void main(String[] args) {
        Account[] arr = new Account[5];
        arr[0] = new SavingsAccount(10000, 200, 0.002);
        System.out.println("Account 1");
        System.out.println("-----------");
        arr[0].interestGained();
        System.out.println("Enter amount to withdraw");
        arr[0].debit();
        System.out.println("-----------");
        arr[0].interestGained();
        System.out.println("Enter amount to withdraw");
        arr[0].debit();
        System.out.println("-----------");
        arr[1] = new SavingsAccount(500, 0, 0.005);
        System.out.println("Account 2");
        System.out.println("-----------");
        arr[1].interestGained();
        System.out.println("Enter amount to withdraw");
        arr[1].debit();


    }

    @Override
    public void debit() {
    }

    @Override
    public void interestGained(){

    }
}
