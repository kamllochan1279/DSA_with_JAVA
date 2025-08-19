import java.util.*;
public class apmethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        

        int a=5 ,d=-3;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a +=d;
        }
        
    }
}
