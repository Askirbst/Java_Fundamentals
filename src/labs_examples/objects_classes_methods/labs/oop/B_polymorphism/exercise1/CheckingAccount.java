package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.exercise1;

public class CheckingAccount extends Account implements Withdraws{
    public CheckingAccount(double balance) {
        super(balance);
    }
}
