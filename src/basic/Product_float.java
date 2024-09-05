package basic;

import java.util.Scanner;

public class Product_float {
    public static void main(String[] args) {
        System.out.println("Enter 2 nos: ");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();

        System.out.println("a * b = "+(a*b));
    }
}
