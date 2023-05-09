package Heroes;

public abstract class BaseHero implements InGameInterface {
    protected int health, speed, minDamage, maxDamage, attack, protection;
    protected String name;




    public BaseHero(String name, int health, int minDamage, int maxDamage, int speed, int attack, int protection) {
        this.name = name;
        this.health = health;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.speed = speed;
        this.attack = attack;
        this.protection = protection;

    }


    public int getHealth(){
        return health;
    }
    public void setHealth(int helth){
        if (helth > 0) this.health = helth;
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


