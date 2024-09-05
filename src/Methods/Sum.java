package Methods;

import java.util.Scanner;

public class Sum {
    /**
     * returns the sum of 2 numbers
     * @param x
     * @param y
     * @return
     */
    public static int Add(int x,int y){
        return (x+y);
    }

    /**
     * Takes user input and passes it to the Add Method
     */
    public static void Input(){
        System.out.println("Enter 2 nos:: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum of a & b :: "+Add(a,b));
    }

    public static void main(String[] args) {
        Input();
    }
}
