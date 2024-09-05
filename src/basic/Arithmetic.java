package basic;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.print("Enter 2 nos: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Arithmetic operation:");
        System.out.println("a + b ="+(a+b));
        System.out.println("a - b ="+(a-b));
        System.out.println("a * b ="+(a*b));
        System.out.println("a / b ="+(a/b));
        System.out.println("a % b ="+(a%b));

    }
}
