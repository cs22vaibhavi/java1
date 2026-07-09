public class LargestOfFour {
    public static void main(String[] args) {

        int a = 25;
        int b = 40;
        int c = 18;
        int d = 32;

        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        if (d > largest) {
            largest = d;
        }

        System.out.println("Largest number = " + largest);
    }
}
