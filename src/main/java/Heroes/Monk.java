package Heroes;

public class Monk extends Magician{


    public Monk(String name) {
        super(10, 20, 20, 30, 5, 4, name);
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
        return "Монах " + name;
    }
}
