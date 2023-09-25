
public class NumbersDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 7;
        displayTwiceTheNumber(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num1);
        displayNumberPlusFive(num2);
        displayNumberSquared(num1);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int num) {
        int result = num * 2;
        System.out.println("Twice the number " + num + " is: " + result);
    }
    public static void displayNumberPlusFive(int num) {
        int result = num + 5;
        System.out.println("The number " + num + " plus five is: " + result);
    }
    public static void displayNumberSquared(int num) {
        int result = num * num;
        System.out.println("The square of the number " + num + " is: " + result);
    }
}

