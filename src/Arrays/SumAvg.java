package Arrays;

import java.util.Scanner;

public class SumAvg {
    public static int Input2(){
        System.out.println("Enter a nos:: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }

    public static int Sum(int[] arr,int n) {
        int add=0;
        for(int i=0;i<n;i++){
            add+=arr[i];
        }
        return add;
    }
    public static int Avg(int[] arr,int n) {
        int add=0;
        for(int i=0;i<n;i++){
            add+=arr[i];
        }
        return add/n;
    }
    public static void main(String[] args) {
        int n=Input2();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int x=Input2();
            arr[i]=x;
        }

        System.out.println("Sum : "+(Sum(arr,n)));
        System.out.println("Avg : "+(Avg(arr,n)));
    }
}
