package Heroes;

public class Crossbowman extends BaseHero{
    private int crossbowAccuracy;

    public Crossbowman(String name, int health, int speed, int crossbowAccuracy) {
        super(name, health, speed);
        this.crossbowAccuracy = crossbowAccuracy;
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
