package Heroes;

public class Sniper extends Archer{


    public Sniper(String name) {
        super(name, 15,8,10,9,12,10,32);
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
