package TestA;

class Add
{
    private int Num1,Num2;

    public int getNum1() {
        return Num1;
    }

    public void setNum1(int Num1) {

        if(Num1 > 0)
            this.Num1 = Num1;
        else
            System.out.println("Enter the number > 0");
    }

    public int getNum2() {
        return Num2;
    }

    public void setNum2(int Num2) {

        if(Num2 > 0)
            this.Num2 = Num2;
        else
            System.out.println("Enter the number > 0");
    }

    public void addNum(int Num1, int Num2)
    {
        System.out.println("Addition of numbers: " + (Num1 + Num2));
    }
}

public class addNum {

    public static void main(String[] args)
    {
        Add _add = new Add();

        _add.setNum1(-1);
        _add.setNum2(3);

        _add.addNum(_add.getNum1(), _add.getNum2());
    }
}
