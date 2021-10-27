package labs_examples.static_nonstatic.variables;

public class House {

    int squareFeet;
    String address;
    static int numHousesBuilt;

    public House(int squareFeet, String address) {
        this.squareFeet = squareFeet;
        this.address = address;
        numHousesBuilt++;
    }

    @Override
    public String toString() {
        return "House{" +
                "squareFeet=" + squareFeet +
                ", address='" + address + '\'' +
                '}' + '\'' + "Number of Houses Built=" + numHousesBuilt;
    }
}
