package Operators;

import java.util.Scanner;

public class OddEven {
    /**
     *
     * This is main Method
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

//        if(n>0 && (n & (n-1))==0) System.out.println("Even");
//        else System.out.println("Odd");
        if((n&1)==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
