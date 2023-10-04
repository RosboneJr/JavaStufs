import java.util.Random;

public class VehicleRace {
    public static Random rand = new Random();
    public static final int INITIAL_SPEED_MIN = 95;
    public static final int INITIAL_SPEED_MAX = 105;
    public static final int DISTANCE_TO_FINISH = 500;
    public static final int MILLIDELAY = 1000;

    public static void main(String[] args) {

        Vehicle car1 = new Vehicle("Toyota", getRandomSpeed());
        Kart car2 = new Kart("Mario Kart", getRandomSpeed());

        System.out.println("Initial Information:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(ConsoleColors.GREEN+"LET THE RACE BEGIN!"+ConsoleColors.RESET);
        raceUntilFinish(car1, car2);

        determineWinner(car1, car2);
        checkForKart(car2);
    }

    public static void raceUntilFinish(Vehicle car1, Vehicle car2){
        while (car1.getDistanceTraveled() < DISTANCE_TO_FINISH && car2.getDistanceTraveled() < DISTANCE_TO_FINISH) {
            raceCars(car1, car2);
            pause(MILLIDELAY);
        }
    }

    public static void determineWinner(Vehicle car1, Vehicle car2){
        if (car1.getDistanceTraveled() >= DISTANCE_TO_FINISH &&
                car1.getDistanceTraveled() > car2.getDistanceTraveled()) {
            System.out.println(car1.getBrand() + " won the race!");
        } else if (car2.getDistanceTraveled() >= DISTANCE_TO_FINISH &&
                car2.getDistanceTraveled() > car1.getDistanceTraveled()){
            System.out.println(car2.getBrand() + " won the race!");
        } else if (car2.getDistanceTraveled() >= DISTANCE_TO_FINISH &&
                car2.getDistanceTraveled() == car1.getDistanceTraveled()){
            System.out.println("It's a tie!");
        }
    }
    public static int getRandomSpeed() {
        return rand.nextInt(INITIAL_SPEED_MAX - INITIAL_SPEED_MIN + 1) + INITIAL_SPEED_MIN;
    }

    public static void raceCars(Vehicle car1, Vehicle car2) {
        // Simulate a race step
        int speed1 = car1.getSpeed();
        int speed2 = car2.getSpeed();

        speed1 += rand.nextInt(21) - 10;
        speed2 += rand.nextInt(21) - 10;

        speed1 = Math.max(speed1, 0);
        speed2 = Math.max(speed2, 0);

        car1.updateDistance(speed1);
        car2.updateDistance(speed2);

        System.out.println(car1.getBrand() + " advanced at an average speed of " + speed1 + "mph and has traveled " + car1.getDistanceTraveled() + " miles");
        System.out.println(car2.getBrand() + " advanced at an average speed of " + speed2 + "mph and has traveled " + car2.getDistanceTraveled() + " miles");
    }
    public static int checkForKart(Kart kart){
        int reducedSpeed = 0;
        int speed = kart.getSpeed();
        reducedSpeed = speed - kart.attack();
        return reducedSpeed;
    }
    public static void pause(int millis){
        try{
            Thread.sleep(millis);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


