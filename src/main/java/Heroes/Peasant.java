package Heroes;

public class Peasant extends BaseHero{
    private int strength;

    public Peasant(String name, int health, int speed, int strength) {
        super(name, health, speed);
        this.strength = strength;
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
