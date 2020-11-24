import java.util.Scanner;

public class Ex4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        displayTwiceTheNumber(a, b);
        displayNumberPlusFive(a, b);
        displayNumberSquare(a, b);
    }

    public static void displayTwiceTheNumber(int a, int b) {
        System.out.println("Twice the number" + a + " is " + (a * 2));
        System.out.println("Twice the number" + b + " is " + (b * 2));
    }

    public static void displayNumberPlusFive(int a, int b) {
        System.out.println(a + " plus 5 is " + (a + 5));
        System.out.println(b + " plus 5 is " + (b + 5));
    }

    public static void displayNumberSquare(int a, int b) {
        System.out.println(a + " square is " + (a * a));
        System.out.println(b + " square is " + (b * b));
    }
}
