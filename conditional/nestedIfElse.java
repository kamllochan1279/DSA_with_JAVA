import java.util.Scanner;

public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        double a = sc.nextDouble();
        System.out.println("enter b:");
        double b = sc.nextDouble();
        System.out.println("enter c:");
        double c = sc.nextDouble();

        if(a > b){
            if(a>c) System.out.println(a+"is greatest");
            else //c>a>b
            System.out.println(c+"is greatest");
        }    
        
        else{
            if(b>c) System.out.println(b+"is greater");
            else
                System.out.println(c+"is greatest");

        }    
        }
   } 

