package Heroes;

public class Monk extends BaseHero{
    private int meditationLevel;

    public Monk(String name, int health, int speed, int meditationLevel) {
        super(name, health, speed);
        this.meditationLevel = meditationLevel;
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
