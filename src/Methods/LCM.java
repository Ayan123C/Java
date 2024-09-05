package Methods;

import java.util.Scanner;

public class LCM {
    public static int Input(){
        System.out.println("Enter a nos:: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }

    public static void main(String[] args) {
        int a=Input();
        int b=Input();

        for(int i=1;i<=(a*b);i++){
            if((a*i)%b==0){
                System.out.println("LCM = "+(a*i));
                break;
            }
        }
    }
}
