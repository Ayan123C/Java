package Methods;

import java.util.Scanner;

public class Factorial {
    public static int Input(){
        System.out.println("Enter a nos:: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }
    public static int fact(int n){
        if(n<2)return 1;
        else return n * fact(n-1);

    }
    public static void main(String[] args) {
        int n=Input();
        System.out.println("Factorial of "+n+" = "+(fact(n)));
    }
}
