package Arrays;

import java.util.Scanner;

public class Input {
    public static int Input2(){
        System.out.println("Enter a nos:: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }
    public static void main(String[] args) {
        int x=Input2();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            int n=Input2();
            arr[i]=n;
        }

        System.out.print("Elements are: ");
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
