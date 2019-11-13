import java.util.Scanner;

public class Swapvalues {
    int x;
    int y;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter second number");
        int y=sc.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println(x);
        System.out.println(y);




    }
}
