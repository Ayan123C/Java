package Methods;

import java.util.Scanner;

public class SumOfDigits {
    public static int Input(){
        System.out.println("Enter a nos:: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }

    public static void main(String[] args) {
        int n=Input(),sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println("Sum of Digits :: "+sum);
    }
}
