package Heroes;

public abstract class Archer extends BaseHero{
    int shots;

    public Archer(String name, int health, int minDamage, int maxDamage, int speed, int attack, int protection, int shots) {
        super(name, health, minDamage, maxDamage, speed, attack, protection);
        this.shots = shots;
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
