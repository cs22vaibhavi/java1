import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, choice;

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        System.out.println("1.Add  2.Subtract  3.Multiply  4.Divide");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                System.out.println(a / b);
                break;

            default:
                System.out.println("Wrong choice");
        }
    }
}
