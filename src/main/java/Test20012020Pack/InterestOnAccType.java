package Test20012020Pack;

import java.util.Scanner;

class Account
{
    public float PrincipalAmt;
    public float RateofInterest;
    public int NoOfYears;
    private float SI;

    Account()
    {
        PrincipalAmt = 100.00f;
        RateofInterest = 1.0f;
        NoOfYears = 1;
    }

    public void CalculateInterest()
    {
        SI = (PrincipalAmt * RateofInterest * NoOfYears)/100;
        System.out.println("SI: " + SI);
        System.out.println("PRINCIPAL AMT. WITH SI : " + (PrincipalAmt + SI));
    }
}

class SavingsAccount extends Account
{
    SavingsAccount()
    {
        RateofInterest = 2.0f;
    }

    @Override
    public void CalculateInterest() {
        super.CalculateInterest();
    }
}

public class InterestOnAccType
{
    static String a;
    static String b;

    public static void main(String[] args) {

        System.out.println("Please select your Account type:");
        System.out.println("a. Savings");
        System.out.println("b. Others");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        switch(input)
        {
            case "a":
            SavingsAccount _sa = new SavingsAccount();
            _sa.CalculateInterest();
            break;

            case "b":
                Account _acc = new Account();
                _acc.CalculateInterest();
                break;
            default:
                System.out.println("Please select appropriate account type.");
                break;
        }
    }
}
