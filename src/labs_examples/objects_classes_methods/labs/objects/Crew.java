package labs_examples.objects_classes_methods.labs.objects;

public class Crew{
    public static Crew myCrew;
    private int numberOfStaff;
    private boolean allFemale;
    private int numberOfPilots;

    public Crew(int numberOfStaff, boolean allFemale, int numberOfPilots) {
        this.numberOfStaff = numberOfStaff;
        this.allFemale = allFemale;
        this.numberOfPilots = numberOfPilots;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public boolean isAllFemale() {
        return allFemale;
    }

    public void setAllFemale(boolean allFemale) {
        this.allFemale = allFemale;
    }

    public int getNumberOfPilots() {
        return numberOfPilots;
    }

    public void setNumberOfPilots(int numberOfPilots) {
        this.numberOfPilots = numberOfPilots;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "numberOfStaff=" + numberOfStaff +
                ", allFemale=" + allFemale +
                ", numberOfPilots=" + numberOfPilots +
                '}';
    }
}
