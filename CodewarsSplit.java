import java.util.Arrays;

public class CodewarsSplit {
    public static String[] solution(String s) {
        if(s.length() % 2 != 0) s = s.concat("_");

        return s.split("(?<=\\G..)");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcdw")));
    }
}