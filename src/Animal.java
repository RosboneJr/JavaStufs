import java.util.Random;

public class Animal {
    public static Random rand = new Random();

    private String type;
    private int strength;
    private int health;

    public Animal(){
        this.type = "";
        this.health = 0;
        this.strength = 1;
    }
    public Animal(String type, int strength, int health){
        setType(type);
        setHealth(health);
        setStrength(strength);

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if(strength <= 0 ){
            this.strength = 1;
        }else {
            this.strength = strength;
        }

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0){
            this.health = 0;
        }else {
            this.health = health;
        }

    }
    public boolean isDead(){
        return  health <=0;
    }
    public int attack(){
        return rand.nextInt(getStrength()+1);

    }

    @Override
    public String toString(){
        return "Type: "+ type + "; Strength " + strength + "; Health " + health;
    }
}
