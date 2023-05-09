package Heroes;

public class Spearman extends Throwers{


    public Spearman(String name) {
        super(name, 10, 1,3,4,4, 5);

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
