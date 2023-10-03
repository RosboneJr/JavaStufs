import java.util.Random;

public class Mammal extends Animal{
    public static Random rand = new Random();

    private AnimalAttack[] attacks = new AnimalAttack[3];
    public Mammal(String type, int strength, int health){
        super(type, strength, health);
        attacks[0] = new AnimalAttack("claws", rand.nextInt(getStrength()+1));
        attacks[1] = new AnimalAttack("bites", rand.nextInt(getStrength()+1));
        attacks[2] = new AnimalAttack("kicks", rand.nextInt(getStrength()+1));

    }
    public int attack(){
        return detailedAttack().getDamage();
    }
    public AnimalAttack detailedAttack(){
        int idx = rand.nextInt(attacks.length);
        return attacks[idx];
    }
}
