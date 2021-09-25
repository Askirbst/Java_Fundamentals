package labs_examples.aggregation;

public class Student {
    int id;
    String name;
    Address address;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void showDetails(){
        System.out.println(id + " " + name);
        System.out.println(address.city + ", " + address.state + ", " + address.country);

    }

    public static void main(String[] args) {
        Address add1 = new Address("Jacksonville", "Florida", "U.S.A.");
        Address add2 = new Address("Charlotte", "North Carolina", "U.S.A.");

        Student st1 = new Student(1003, "Alex", add1);
        Student st2 = new Student(2004, "Lora", add2);

        st1.showDetails();
        st2.showDetails();
    }
}
