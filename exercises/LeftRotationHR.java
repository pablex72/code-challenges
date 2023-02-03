package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotationHR {


    public static void main(String[] args) {
        List<Integer> liIn = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        rotateLeft(2, liIn);
    }
        /*
         * Complete the 'rotateLeft' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER d
         *  2. INTEGER_ARRAY arr
         */

    /*Sample Input: 5 4
                        1 2 3 4 5
      Sample Output: 5 1 2 3 4*/

        public static List<Integer> rotateLeft(int d, List<Integer> arr) {
            // Write your code here

//            //first the n times that the array will be rotate
//            for (int i =0 ; i< d ; i++){
//
//                int j,firstElement;
//                firstElement = arr.get(0);
//                //second here we will rotate only one time (one shift)
//                for (j=0; j< arr.size()-1; j++){
//                    arr.set(j, arr.get(j+1));
//                }
//                arr.set(j,firstElement);
//            }
//            return arr;
            List<Integer> result = new ArrayList<>();

            for(int i = d; i < arr.size(); i++) {
                result.add(arr.get(i));
            }

            for(int i = 0; i < d; i++) {
                result.add(arr.get(i));
            }
            System.out.println(result);
            return result;
        }

    }

