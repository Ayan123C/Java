package Methods;

import java.util.Scanner;

public class MultiplicationTable {
    public static int Input(){
        System.out.println("Enter a nos:: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }
    public static void main(String[] args) {
        int n=Input();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",n,i,(n*i));
        }
    }
}
