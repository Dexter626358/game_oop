package Heroes;

public class Throwers extends BaseHero{
    protected String name;
    protected int spearLength;

    public Throwers(int hp, int maxHp, int att, int def, int spearLength, String name) {
        super(hp, maxHp, att, def);
        this.name = name;
        this.spearLength = spearLength;
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
