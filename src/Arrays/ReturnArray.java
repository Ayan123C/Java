package Arrays;

import java.util.Scanner;

public class ReturnArray {
    public static int Input2(){
        System.out.println("Enter a nos:: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }
//    public static int[] deleteElement(int arr[], int key){
//        int ind=-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==key){
//                ind=i;
//                continue;
//            }
//        }
//        for(int i=ind;i< arr.length-1;i++){
//            arr[i]=arr[i+1];
//        }
//        return arr;
//    }
public static int[] deleteElement(int arr[], int key){
        int brr[]=new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                continue;
            }
            brr[j++]=arr[i];
        }

        return brr;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=Input2();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Input2();
        }
        print(arr);
        System.out.println("Delete element key:: ");
        int key=Input2();

        int[] brr= deleteElement(arr,key);

        print(brr);
    }
}
