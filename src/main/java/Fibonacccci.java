import java.util.Scanner;

public class Fibonacccci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the loop count");
        int n=sc.nextInt();
        int x=0,y=1;
        System.out.println("Fibonacci series is ");
        for (int i = 1; i <= n; i++)
        {
            System.out.print(x+" ");
            int sum = x+y;
            x = y;
            y = sum;
        }

    }
}
