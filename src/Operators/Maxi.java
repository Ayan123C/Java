package Operators;
import java.util.Scanner;
public class Maxi {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 nos: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int maxi;
        if(a>b && a>c) maxi=a;
        else if(b>c && b>a) maxi=b;
        else maxi=c;

        System.out.print("maximum of the 3 nos is: "+maxi);
    }
}
