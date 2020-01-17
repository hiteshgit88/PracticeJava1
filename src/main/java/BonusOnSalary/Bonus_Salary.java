package BonusOnSalary;

import java.util.Scanner;

public class Bonus_Salary {

    public static void main (String[] args)
    {
        int a,b;
        char c;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary");
        a = input.nextInt();
        System.out.println("Enter Gender:");
        String g = input.next();
        char d[] = g.toCharArray();
        c = d[0];

        if(c=='f')
        {
            b=(a*10)/100;
            System.out.println("Bonus Applicable :"+b);
        }
        else
        {
            if(c=='m')
            {
                b=(a*5)/100;
                System.out.println("Bonus Applicable :"+b);
            }
            else
                System.out.println("Invalid gender");
        }

    }

}
