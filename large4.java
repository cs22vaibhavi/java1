public class LargestOfFour {
    public static void main(String[] args) {

        int a = 15;
        int b = 30;
        int c = 20;
        int d = 25;

        if (a >= b && a >= c && a >= d) {
            System.out.println("Largest number = " + a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println("Largest number = " + b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println("Largest number = " + c);
        } else {
            System.out.println("Largest number = " + d);
        }
    }
}
