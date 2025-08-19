import java.util.*;
public class profitlose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost price:");
        int cp = sc.nextInt();
        System.out.println("enter selling price:");
        int sp = sc.nextInt();
        
        if(sp>cp)System.out.println("profit");
        if(sp<cp)System.out.println("loss");
        if(sp==cp)System.out.println("no loss no profit");
    }
}
