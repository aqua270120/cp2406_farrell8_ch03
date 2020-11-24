public class Ex4a {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
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
