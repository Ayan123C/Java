package Methods;

import java.util.Scanner;

public class GCD {
    public static int Input(){
        System.out.println("Enter a nos:: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }
    public static void main(String[] args) {
        int a=Input();
        int b=Input();
        int ans=1;
        for(int i=2;i<=Integer.min(a,b);i++){
            if(a%i==0 && b%i==0){
                ans=Integer.max(ans,i);
            }
        }
        System.out.println("GCD = "+ans);
    }
}
