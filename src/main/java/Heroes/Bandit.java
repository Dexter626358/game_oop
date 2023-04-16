package Heroes;

public class Bandit extends BaseHero{
    private int agility;

    public Bandit(String name, int health, int speed, int agility) {
        super(name, health, speed);
        this.agility = agility;
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
