import java.util.Scanner;

public class InchConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value in inches: ");
        double inches = scanner.nextDouble();
        converttofeet(inches);
        converttoyards(inches);
    }
    public static void converttofeet(double inches) {
        double feet = inches / 12;
        System.out.println(inches + " inches is equal to " + feet + " feet.");
    }
    public static void converttoyards(double inches) {
        double yards = inches / (12 * 3);
        System.out.println(inches + " inches is equal to " + yards + " yards.");
    }
}

