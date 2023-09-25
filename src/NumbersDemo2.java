import java.util.Scanner;
public class NumbersDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        displaytwicethenumber(num1);
        displaytwicethenumber(num2);
        displaynumberplusfive(num1);
        displaynumberplusfive(num2);
        displaynumbersquared(num1);
        displaynumbersquared(num2);
    }
    public static void displaytwicethenumber(int num) {
        int result = num * 2;
        System.out.println("Twice the number " + num + " is: " + result);
    }
    public static void displaynumberplusfive(int num) {
        int result = num + 5;
        System.out.println("The number " + num + " plus five is: " + result);
    }
    public static void displaynumbersquared(int num) {
        int result = num * num;
        System.out.println("The square of the number " + num + " is: " + result);
    }
}

