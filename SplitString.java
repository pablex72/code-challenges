public class SplitString {


    public static void main(String[] args) {
        solution("dasdas");
    }

    /**
     * * 'abc' =>  ['ab', 'c_']
     * * 'abcdef' => ['ab', 'cd', 'ef']
     */
        public static String[] solution(String s) {
            //Write your code here

            String str = "geekss@for@geekss";
            String[] newS = s.split("");

            //String newS[] = str.split("@");;
            //System.out.println(newS.toString());
            String[] newSS = new String[1];
            for (int i = 0 ; i < newS.length ; i++ ) {

                //newSS
                System.out.println("aaaaa " + newSS.toString());

            }
            return newS ;
        }

}
