import java.util.*;
public class fiveDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();

        if(n>9999 && n<100000) System.out.println("five digit number");
        else System.out.println("not afive digit number");

    }
}
