import java.util.Random;


public class VehicleRacefalse {
    public static Random rand = new Random();

    public static final int INITIAL_SPEED_MIN = 105;
    public static final int INITIAL_SPEED_MAX = 110;
    public static final int DISTANCE_TO_FINISH = 500;
    public static final int MILLIDELAY = 1000;
    public static int speez = 1;
    public static void main(String[] args) {
        Vehiclefalse car1 = new Vehiclefalse("car1",speez = rand.nextInt(INITIAL_SPEED_MAX - INITIAL_SPEED_MIN) + INITIAL_SPEED_MIN);
        Vehiclefalse car2 = new Vehiclefalse("car2",speez = rand.nextInt(INITIAL_SPEED_MAX - INITIAL_SPEED_MIN) + INITIAL_SPEED_MIN);
        System.out.println(car2);
        System.out.println(car1);
    }
}
