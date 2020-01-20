package ExceptionPack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionlClassDemo {

    public static void main(String[] args) throws IOException {

        int Num1, Num2, Result= 0;
        //BufferedReader _bfr = null;

        //BufferedReader _bfr = new BufferedReader(new FileReader(ExceptionlClassDemo.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "test1.txt"));

        try (BufferedReader _bfr = new BufferedReader(new FileReader(ExceptionlClassDemo.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "test.txt"));)
        {
            Scanner _scaneer = new Scanner(System.in);

            System.out.println(_bfr.readLine());

            Num1 = _scaneer.nextInt();
            Num2 = _scaneer.nextInt();

            Result = Num1 / Num2;
        }
        catch (ArithmeticException aex) {
            aex.printStackTrace();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        System.out.println("Divison Result: " + Result);

    }
}
