package Heroes;

public class Peasant extends Human{
    private int delivery;

    public Peasant(String name){
        super(name, 1, 1, 1,3, 1,1);
        this.delivery = 1;
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
