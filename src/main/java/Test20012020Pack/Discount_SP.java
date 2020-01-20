package Test20012020Pack;

import java.util.Scanner;

public class Discount_SP {
    public static void main(String[] args) {
        double sp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mrp of product");
        double mrp = sc.nextDouble();
        System.out.println("Enter discount to be given");
        double discount = sc.nextDouble();

        double discountinr = mrp * (discount / 100);
        sp = mrp-discountinr;
        System.out.println("Selling Price after discount applied is " + sp);
    }
}