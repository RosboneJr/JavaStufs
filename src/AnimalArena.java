import java.util.Random;

public class AnimalArena {
    public static Random rand = new Random();
    public static final int MAXHEALTH = 20;
    public static final int MAXSTRENGTH = 10;
    public static final int MILLIDELAY = 500;
    public static void main(String[] args) {
        Animal BiliApe = creAnimalWithDefaultConstructor("BiliApe");
        Animal Sloth = creAnimalWithParameterizedConstructor("Sloth");
        System.out.println(BiliApe);
        System.out.println(Sloth);
        System.out.println("It's " + BiliApe.getType() + " vs " + Sloth.getType() + "!");
        System.out.println("FIGHT!");
        fight(BiliApe, Sloth);
    }
    public static Animal creAnimalWithDefaultConstructor(String type){
        Animal a = new Animal();

        int startingHealth = (rand.nextInt(MAXHEALTH/2) + 1) + 10;
        int startingStrength = rand.nextInt(MAXSTRENGTH) + 1;
        a.setType(type);
        a.setStrength(startingStrength);
        a.setHealth(startingHealth);
        return a;
    }
    public static Animal creAnimalWithParameterizedConstructor(String type){
        int startingHealth = (rand.nextInt(MAXHEALTH/2) + 1) + 10;
        int startingStrength = rand.nextInt(MAXSTRENGTH) + 1;
        return  new Animal(type, startingStrength, startingHealth);
    }
    public static void fight(Animal a1, Animal a2){
        while (!a1.isDead() && !a2.isDead()){
            AnimalAttack(a1, a2);
            if(a2.isDead()){
                System.out.println(a2.getType() + " is dead. " + a1.getType() + " won!");
            }else{
                AnimalAttack(a2, a1);
                if(a1.isDead()){
                    System.out.println(a1.getType() + " is dead. " + a2.getType() + " won!");
                }
            }
        }
    }
    public static void AnimalAttack(Animal attacker, Animal defender){
        int attack = rand.nextInt(attacker.getStrength());
        System.out.println(attacker.getType() + " attack " + defender.getType() + " delivering " + attack + " damage!");
        pause(MILLIDELAY);
        defender.setHealth(defender.getHealth() - attack);
        System.out.println(defender.getType() + " has " + defender.getHealth() + " remaining");
        pause(MILLIDELAY);
    }
    public static void pause(int miliseconds){
        try {
            Thread.sleep((miliseconds));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
