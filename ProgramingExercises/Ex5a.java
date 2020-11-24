public class Ex5a {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 5.0;
        computePercent(a, b);
        computePercent(b, a);
    }
    public static void computePercent(double a, double b){
        System.out.println(a + " is " + Math.round(( a * 100 / b)) + " percent of " + b);
    }
}
