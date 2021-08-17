package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {

    Engine myEngine;
    Crew myCrew;
    Hull myHull;
    Wings myWings;

    public Airplane(Engine myEngine, Crew myCrew, Hull myHull, Wings myWings) {
        this.myEngine = myEngine;
        this.myCrew = myCrew;
        this.myHull = myHull;
        this.myWings = myWings;
    }

    public Engine getMyEngine() {
        return myEngine;
    }

    public void setMyEngine(Engine myEngine) {
        this.myEngine = myEngine;
    }

    public Crew getMyCrew() {
        return myCrew;
    }

    public void setMyCrew(Crew myCrew) {
        this.myCrew = myCrew;
    }

    public Hull getMyHull() {
        return myHull;
    }

    public void setMyHull(Hull myHull) {
        this.myHull = myHull;
    }

    public Wings getMyWings() {
        return myWings;
    }

    public void setMyWings(Wings myWings) {
        this.myWings = myWings;
    }

    @Override
    public String toString() {
        return "Airplane{\n " +
                "myEngine=" + myEngine.toString() +
                ", \n myCrew=" + myCrew.toString() +
                ", \n myHull=" + myHull.toString() +
                ", \n myWings=" + myWings.toString() +
                '}';
    }
}