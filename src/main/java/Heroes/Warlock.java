package Heroes;

public class Warlock extends Magician{


    public Warlock(String name) {
        super(name, 30, -5, -5, 9,17,12, 1);
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
        return "Колдун " + name;
    }
}
