package Heroes;

public abstract class Archer extends BaseHero{
    int shots, maxShots;
    protected String name;

    public Archer(int hp, int maxHp, int att, int def, int shots, int maxShots, String name) {
        super(hp, maxHp, att, def);
        this.shots = shots;
        this.maxShots = maxShots;
        this.name = name;
    }

    public int getAtt(){
        return super.att;
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
