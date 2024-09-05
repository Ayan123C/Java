package basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.print("Enter principle, rate_of_interest & time : ");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        float r=sc.nextFloat();
        int t=sc.nextInt();

        float ans=(p*r*t)/100;

        System.out.println("Simple Interest = "+ans);
    }
}
