package Heroes;

public class Magician extends BaseHero{
    private int magicPower;
    private int meditationLevel;
    protected String name;

    public Magician(int hp, int maxHp, int att, int def, int magicPower, int meditationLevel, String name) {
        super(hp, maxHp, att, def);
        this.magicPower = magicPower;
        this.meditationLevel = meditationLevel;
        this.name = name;
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
