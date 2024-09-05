package Operators;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year to check for Leap Year:: ");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        boolean check = false;

        if(year%4==0 && year%100!=0)check=true;
        else if (year%100==0 && year%400==0) check=true;

        System.out.println(check);
    }
}
