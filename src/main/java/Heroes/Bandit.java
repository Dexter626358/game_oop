package Heroes;

public class Bandit extends Human{


    public Bandit(String name) {
        super(name, 10,2,4,6,8,3);
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

    @Override
    public String getInfo() {
        return "Бандит " + name;
    }
}
