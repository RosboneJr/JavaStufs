import java.util.Random;


public class VehicleRace {
    public static Random rand = new Random();

    public static final int INITIAL_SPEED_MIN = 105;
    public static final int INITIAL_SPEED_MAX = 110;
    public static final int DISTANCE_TO_FINISH = 500;
    public static final int MILLIDELAY = 1000;
    public static int speez = 1;
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("car1",speez = rand.nextInt(INITIAL_SPEED_MAX - INITIAL_SPEED_MIN) + INITIAL_SPEED_MIN);
        Vehicle car2 = new Vehicle("car2",speez = rand.nextInt(INITIAL_SPEED_MAX - INITIAL_SPEED_MIN) + INITIAL_SPEED_MIN);
        System.out.println(car2);
        System.out.println(car1);
    }
}
