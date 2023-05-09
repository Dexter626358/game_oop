package Heroes;

public class Monk extends Magician{


    public Monk(String name) {
        super(name, 30, -4, -4, 5, 12, 7,1);
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
