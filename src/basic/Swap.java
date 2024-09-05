package basic;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.print("Enter 2 nos : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Before swapping:\na = "+a+" , b = "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:\na = "+a+" , b = "+b);

    }
}
