import java.util.*;
public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        double a = sc.nextDouble();
        System.out.println("enter b:");
        double b = sc.nextDouble();
        System.out.println("enter c:");
        double c = sc.nextDouble();

        if(a>b && a>c) System.out.println(a+"is greater");
        else if(b>a && b>c) System.out.println(b+"is greater");
        else System.out.println(c+"is greater");

    }
}
