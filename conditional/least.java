import java.util.Scanner;

public class least {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        double a = sc.nextDouble();
        System.out.println("enter b:");
        double b = sc.nextDouble();
        System.out.println("enter c:");
        double c = sc.nextDouble();

        if(a<b && a<c) System.out.println(c+"is least");
        else if(b<a && b<c) System.out.println(b+"is least");
        else System.out.println(c+"is least");
    }    
}
