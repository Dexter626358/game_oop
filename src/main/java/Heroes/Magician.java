package Heroes;

public class Magician extends BaseHero{
    private int mana;

    public Magician(String name, int health, int minDamage, int maxDamage, int speed, int attack, int protection, int mana) {
        super(name, health, minDamage, maxDamage, speed, attack, protection);
        this.mana = mana;
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
