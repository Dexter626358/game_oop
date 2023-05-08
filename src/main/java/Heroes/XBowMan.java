package Heroes;

public class XBowMan extends Archer {
    public XBowMan(String name) {
        super(1,1,1,1,1,1, name);
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
