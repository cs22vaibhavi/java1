public class TryCatch {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Error occurred!");
        }
    }
}
