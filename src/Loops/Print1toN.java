package Loops;

public class Print1toN {
    public static void main(String[] args) {
        System.out.println("For Loop");
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nWhile Loop");
        int i=0;
        while(i<10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("\nDo While Loop");
        i=0;
        do{
            System.out.print(i+" ");
            i++;
        }while (i<10);
    }
}
