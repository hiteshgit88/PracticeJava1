package TestA;

public class addWithOvrld {
    static Object z;

    public static void calculate(int x, int y) {
        z = x + y;
        System.out.println(z);
    }

    public static void calculate(float x, float y) {
        z = x + y;
        System.out.println(z);
    }

    public static void main(String[] args) {

        addWithOvrld calc = new addWithOvrld();

        calculate(1,2);

        calc.calculate((float)2.5,(float)5.5);

    }
}