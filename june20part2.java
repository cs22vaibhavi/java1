import java.util.*;
public class switchstatement1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        
        switch(button){
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("hiiiii");
            break;
            case 3:System.out.println("namaste");
            break;
            case 4:System.out.println("namaskar");
            break;
            case 5:System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid Button");
             
        }
    }
}
