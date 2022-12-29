    import java.util.*;

    public class SplitString2 {
        public static String[] solution(String s) {
            List<String> result = new ArrayList<String>();
            if(s.length() %2 == 1){
                s = s+"_";
            }
            for(int i=0;i<s.length() - 1;i+=2){
                result.add(s.substring(i, i+2));
            }
            return result.toArray( new String[0] );
        }
        public static void main(String[] args) {
            System.out.println(Arrays.toString(solution("abcdw")));
        }
    }

