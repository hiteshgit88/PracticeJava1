package ArmStrongNumber;

public class ArmStrongNum {

    public static void main(String[] args) {
        int n = 153, sum = 0, mod, num;
        num=n;

        while(n>0)
        {
            mod = n%10;
            n = n/10;
            sum = sum + (mod*mod*mod);
        }

        if(num == sum){
            System.out.println("Armstrong Number Confirmed");
        }
        else
        {
            System.out.println("Not Armstrong Number Confirmed");
        }

    }

}
