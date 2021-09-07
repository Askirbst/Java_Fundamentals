package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {

    Engine myEngine;
    Crew myCrew;
    Hull myHull;
    Wings myWings;

    public Airplane(Engine myEngine, Crew myCrew, Hull myHull, Wings myWings) {
        Engine.myEngine = myEngine;
        Crew.myCrew = myCrew;
        Hull.myHull = myHull;
        Wings.myWings = myWings;
    }

    public Engine getMyEngine() {
        return myEngine;
    }

    public void setMyEngine(Engine myEngine) {
        Engine.myEngine = myEngine;
    }

    public Crew getMyCrew() {
        return myCrew;
    }

    public void setMyCrew(Crew myCrew) {
        Crew.myCrew = myCrew;
    }

    public Hull getMyHull() {
        return myHull;
    }

    public void setMyHull(Hull myHull) {
        Hull.myHull = myHull;
    }

    public Wings getMyWings() {
        return myWings;
    }

    public void setMyWings(Wings myWings) {
        Wings.myWings = myWings;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "myEngine=" + myEngine +
                ", myCrew=" + myCrew +
                ", myHull=" + myHull +
                ", myWings=" + myWings +
                '}';
    }
}