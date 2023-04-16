package Heroes;

abstract class BaseHero {
    protected String name;
    protected int health;
    protected int speed;
//    protected int endurance;
//    protected int strength;
//    protected int agility;
//    protected boolean terrain_knowledge;
//    protected boolean ballistics_knowledge;
//    protected boolean religion_knowledge;
//    protected boolean magic_ability;
//    protected boolean weapon_skills;


    public BaseHero(String name, int health, int speed) {
        this.name = name;
        this.health = health;
        this.speed = speed;
    }

    abstract void attack();
    abstract void defense();
    abstract void health();
}


