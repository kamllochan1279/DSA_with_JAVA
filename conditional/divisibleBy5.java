import java.util.*;
public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        if(n%5==0)System.out.println("divisible by 5");
        else System.out.println("not divisible by 5");
    }
}
