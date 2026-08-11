public class Main{
    public static void main(String[]args){
        var alarm=true;
        var bath=true;
        var breakfast=true;
        var learn=true;
        var sleep=true;

        if(alarm){
            System.out.println("Wake up");
        }else{
            System.out.println("not waking up");
        }
        System.out.println("GO TO BATHROOM");
        if(bath){
            System.out.println("Do no take bath");
        }else{
            System.out.println("take bath");
        }
        System.out.println("GO TO BREAKFAST");
        if(breakfast){
            System.out.println("Eat breakfast");
        }else{
            System.out.println("do not eat breakfast");
        }
        System.out.println("GO TO LEARN");
        if(learn){
            System.out.println("Continue to learn");
        }else{
            System.out.println("Do not learn");
        }
        System.out.println("GO TO SLEEP");
        if(sleep){
            System.out.println("sleep");
        }else{
            System.out.println("Do not sleep");
        }
    }
}
