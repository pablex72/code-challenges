package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SparseArrayHashMapHR {

    public static void main(String[] args) {
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

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for ( String string : strings ) {
            Integer def = map.getOrDefault(string, 0) + 1; //making get and init
            map.put(string, def);
        }
        for (int i = 0; i< queries.size(); i++){
            results.add(i, map.getOrDefault(queries.get(i), 0));
           // results[i] = map.getOrDefault(queries[i], 0);
        }
        return results;
    }
}
