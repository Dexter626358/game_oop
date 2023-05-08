package Heroes;

public class Warlock extends Magician{


    public Warlock(String name) {
        super(10, 20, 30, 4, 5, 6, name);
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
