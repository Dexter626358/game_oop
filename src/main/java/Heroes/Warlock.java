package Heroes;

public class Warlock extends BaseHero{
    private int magicPower;

    public Warlock(String name, int health, int speed, int magicPower) {
        super(name, health, speed);
        this.magicPower = magicPower;
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
