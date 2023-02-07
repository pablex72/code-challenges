package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArraysIntHR {
    public static void main(String[] args) {

        //List<String> str = List.of(new String[]{"aba","baba","aba","xzxb"});
        //List<String> str = List.of(new String[]{"aba", "baba", "aba", "xzxb"});

        List<String> str = List.of("abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf");


        //List<String> que = List.of(new String[]{"aba", "xzxb", "ab"});
        List<String> que = List.of("abcde", "sdaklfj","asdjf", "na", "basdn");



        System.out.println("str" + str);
        System.out.println("que" + que);
        System.out.println(matchingStrings(str,que));
        for (int i : matchingStrings(str,que) ) {
            System.out.println(i);
        }
    }

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static int[] matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here

        List<Integer> countMatch = new ArrayList();
        int[] count = new int[queries.size()];
        int k=0;
        for (int i = 0; i<queries.size(); i++){
            for( int j =0; j< stringList.size(); j++){
                if(stringList.get(j) == queries.get(i)){
                    count[i]++;
                }
            }
        }
        //countMatch = (List<Integer>) Arrays.asList(count);
        return count;
    }
}