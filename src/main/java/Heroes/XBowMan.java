package Heroes;

public class XBowMan extends Archer {
    public XBowMan(String name) {
        super(name, 10, 2, 3, 4,6,3,16);
    }

    @Override
    public String getInfo() {
        return "Снайпер " + name;
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
