import java.util.*;
public class profitloss2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter cost price");
       int cp =sc.nextInt();
       System.out.println("enter selling price");
       int sp =sc.nextInt();
       
         if(sp>cp)System.out.println("profit:" +(sp-cp));
        if(sp<cp)System.out.println("loss" +(cp-sp));
        if(sp==cp)System.out.println("no loss no profit" +(0));
    }
}
