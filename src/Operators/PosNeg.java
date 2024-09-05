package Operators;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n<0) System.out.println("Negative");
        else System.out.println("Positive");
    }
}
