import java.util.Scanner;

public class Ex5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a and b");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        computePercent(a, b);
        computePercent(b, a);
    }

    public static void computePercent(double a, double b){
        System.out.println(a + " is " + Math.round(( a * 100 / b)) + " percent of " + b);
    }
}
