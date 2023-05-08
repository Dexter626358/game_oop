package Heroes;

public class Sniper extends Archer{


    public Sniper(String name) {
        super(1,1,1,1,1,1, name);
    }

    @Override
    public String getInfo() {
        return "Арболетчик " + name;
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
