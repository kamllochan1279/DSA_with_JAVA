import java.util.*;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number:");

        int n = sc.nextInt();
        if(n<0)System.out.println(-n);
        else System.out.println(n);
    }
}
