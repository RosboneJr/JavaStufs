import javax.swing.text.html.HTMLDocument;
import java.util.Random;

public class Kart extends Vehicle {
    public SpecialItem[] items = new SpecialItem[3];
    public static Random rand = new Random();


    public Kart(String brand, int speed) {
        super(brand, speed);
        brand = "Mario Kart";
        items = new SpecialItem[3];
        items[0] = new SpecialItem("Green Shell", 7, ConsoleColors.RED);
        items[1] = new SpecialItem("Boomerang", 5, ConsoleColors.BLUE);
        items[2] = new SpecialItem("Banana", 1, ConsoleColors.YELLOW);
    }
    public int attack(){
        SpecialItem Attack = detailedAttack();
        System.out.println(Attack);
        return Attack.getDelay();
    }
    public SpecialItem detailedAttack(){
        int idx = rand.nextInt(3);
        return items[idx];
    }
}
