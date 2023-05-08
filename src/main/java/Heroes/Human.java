package Heroes;

public class Human extends BaseHero{
    protected String name;
    private int agility;

    public Human(int hp, int maxHp, int att, int def, int agility, String name) {
        super(hp, maxHp, att, def);
        this.name = name;
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
