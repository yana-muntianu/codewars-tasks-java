package codewars.tasks.java.battle;

public class Fighter {
    private String name;
    private int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String getName(){

        return name;
    }
    public int getHealth(){

        return health;
    }
    public int getDamagePerAttack(){

        return damagePerAttack;
    }
}
