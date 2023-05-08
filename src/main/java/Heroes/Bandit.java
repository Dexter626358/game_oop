package Heroes;

public class Bandit extends Human{


    public Bandit(String name) {
        super(10, 20, 0, 30, 20, name);
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
