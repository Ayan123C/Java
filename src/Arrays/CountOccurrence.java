package Arrays;

import java.util.Scanner;

public class CountOccurrence {
    public static int Input2(){
        System.out.println("Enter a nos:: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }
    public  static  int Count(int arr[],int key){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)c++;
        }
        return c;
    }
    public static void main(String[] args) {
        int n=Input2();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Input2();
        }
        System.out.println("Enter key to search");
        int key=Input2();
        System.out.println("Count of the number:: "+Count(arr,key));
    }
}
