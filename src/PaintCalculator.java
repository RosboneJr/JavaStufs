import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the room in feet --> ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the room in feet --> ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the room in feet --> ");
        double height = scanner.nextDouble();

        double wallArea = calculatewallarea(length, width, height);
        double gallonsNeeded = calculategallonsneeded(wallArea);
        double totalPrice = calculateprice(gallonsNeeded);

        System.out.println("You will need " + gallonsNeeded + " gallons of paint.");
        System.out.println("The total price for the paint is $" + totalPrice);
    }
    public static double calculatewallarea(double length, double width, double height) {
        return 2 * (length + width) * height;
    }
    public static double calculategallonsneeded(double wallArea) {
        return wallArea / 350.0;
    }
    public static double calculateprice(double gallonsNeeded) {
        return Math.ceil(gallonsNeeded) * 32.0;
    }
}
