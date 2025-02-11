package arrays;

import java.util.Arrays;

public class Main2D {
    public static void main(String[] args) {

        TwoDimensionalArray tda = new TwoDimensionalArray(3,3);

        tda.insertValueInTheArray(0,0,10);
        tda.insertValueInTheArray(0,1,20);
        tda.insertValueInTheArray(0,2,30);
        tda.insertValueInTheArray(1,1,40);
        tda.insertValueInTheArray(1,2,50);
        tda.insertValueInTheArray(2,2,60);
        tda.insertValueInTheArray(0,0,70);

        System.out.println(Arrays.deepToString(tda.arr));

        tda.accessCell(0,0);
        tda.accessCell(4,4);

        tda.insertValueInTheArray(1,0,70);
        tda.insertValueInTheArray(2,0,80);
        tda.insertValueInTheArray(2,1,90);

        tda.traverse2DArray();

        tda.searchingValue(20);
        tda.searchingValue(1000);

    }
}
