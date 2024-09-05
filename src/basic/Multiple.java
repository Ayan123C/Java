package basic;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        System.out.print("Enter a no: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0) System.out.println("Multiple of 3");
        else System.out.println("Not a multiple of 3");
    }
}
