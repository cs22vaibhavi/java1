import java.util.*;
public class conditionifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a==b){
            System.out.println("equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("a is lesses");
        }
        
    }
}


class conditionifelse2{
    public static void main(String[] args) {
        int a=10;
        int b=15;

        if(a==b){
            System.out.println("equals");
        }else if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }

    }
}

class conditionifelse3{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;

        if(a>b && a>c){
            System.out.println("a is greater");
        }else if(b>a && b>c){
            System.out.println("b is greater");
        }else{
            System.out.println("c is greater");
        }
        
    
        }

        
    }
