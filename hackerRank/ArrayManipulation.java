package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class ArrayManipulation {
    public static void main(String[] args) {

    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long max = 110;
        int rowSize = 5;
        int colSize = 3;
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        for (int i = 0; i < rowSize; i++) {
            List<Integer> arrRow = new ArrayList<Integer>();
            for (int j = 0; j < colSize; j++) {
              //  arrRow.add(x);
            }
            arr.add(arrRow);
        }

        return max;
    }
}
