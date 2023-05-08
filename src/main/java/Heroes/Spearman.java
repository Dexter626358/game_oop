package Heroes;

public class Spearman extends Throwers{


    public Spearman(String name) {
        super(1, 1, 1, 1, 1, name);

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
        return "Копейщик " + name;
    }
}
