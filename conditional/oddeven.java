import java.util.*;

public class oddeven{
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n = Sc.nextInt();

        if(n%2==0)System.out.println("even");
        if(n%2==1)System.out.println("odd");
    }
}
