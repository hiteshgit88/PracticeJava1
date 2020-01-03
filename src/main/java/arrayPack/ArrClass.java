package arrayPack;

import java.util.ArrayList;
import java.util.List;

public class ArrClass {

    public static void main(String[] args) {

        int[] arrint = new int[]{1, 2, 3};
        //Integer[] arrInteger = new Integer[2];

        for(int i = 0; i < arrint.length; i++)
        {
            System.out.println(arrint[i]);
        }

        String[][] arrMultiDimInt = new String[][]{ {"One","1"}, {"Two","2"}};

        for (int i = 0; i < arrMultiDimInt.length; i++)
        {
            for (int j = 0; j < arrMultiDimInt.length; j++)
            {
                System.out.println(arrMultiDimInt[i][j]);
            }
        }

        ArrayList<Integer> arrListOfInteger = new ArrayList<Integer>();

        arrListOfInteger.add(1);
        arrListOfInteger.add(2);
        arrListOfInteger.add(3);
        arrListOfInteger.add(4);

        for(int i = 0; i < arrListOfInteger.size(); i++)
        {
            System.out.println("For: " + arrListOfInteger.get(i));
        }

        for (Integer item: arrListOfInteger) {
            System.out.println("For Each: " + item);
        }

        List<Integer> listOfInteger = new ArrayList<Integer>();

        //ArrayList<Integer> _arrListOfInteger;
        for(int i=0; i < 4; i++)
        {
            Integer _integer = i;

            //_integer = 1;

            listOfInteger.add(_integer);

        }

        for (Integer item1: listOfInteger) {

            System.out.println("Over Object: " + item1);

        }






    }
}
