package Heroes;

public abstract class BaseHero implements InGameInterface {
    protected int hp, maxHp, att, def;

//    protected int endurance;
//    protected int strength;
//    protected int agility;
//    protected boolean terrain_knowledge;
//    protected boolean ballistics_knowledge;
//    protected boolean religion_knowledge;
//    protected boolean magic_ability;
//    protected boolean weapon_skills;


    public BaseHero(int hp, int maxHp, int att, int def) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.att = att;
        this.def = def;
    }


    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        if (hp > 0) this.hp = hp;
    }


    abstract void attack();
    abstract void defense();
    abstract void health();

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return null;
    }
}


