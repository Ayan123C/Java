package Methods;

import java.util.Scanner;

public class OddSum {
    public static int Input(){
        System.out.println("Enter a nos:: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }

    public static void main(String[] args) {
        int n=Input(),ans=0;
        for(int i=1;i<=n;i+=2) ans+=i;
        System.out.println("sum = "+ans);
    }
}
