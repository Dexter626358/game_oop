package Heroes;

public class Peasant extends Human{
    //private int strength;

    public Peasant(String name){
        super(20, 30, 40, 50, 0, name);
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + name;
    }

    @Override
    void attack() {

    }

    @Override
    void defense() {

    }

    @Override
    void health() {

    }
}
