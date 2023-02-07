package exercises;

import java.util.ArrayList;
import java.util.List;

public class SparseArraysHR {
    public static void main(String[] args) {

        //List<String> str = List.of(new String[]{"aba","baba","aba","xzxb"});
        List<String> str = List.of(new String[]{"aba", "baba", "aba", "xzxb"});
        List<String> que = List.of(new String[]{"aba", "xzxb", "ab"});
        System.out.println(str);
        System.out.println(matchingStrings(str,que));
    }

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here

        List<Integer> countMatch = new ArrayList<>();
        int k=0;
        for (int i = 0; i<queries.size(); i++){
            for( int j =0; j< stringList.size(); j++){
                if(stringList.get(j) == queries.get(i)){
                    i++;
                }
            }
        }
        return countMatch;
    }
}
