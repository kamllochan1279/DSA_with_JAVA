import java.util.*;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b =sc.nextInt();
        System.out.println("enter c");
        int c =sc.nextInt();

        if((a+b)>c && (a+c)>b && (b+c)>a)System.out.println("triangle");
        else System.out.println("not atriangle");

    }
}
