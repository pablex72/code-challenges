/* Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == [] */

public class InvertedValuesK8 {

    public static int[] invert(int[] array) {
        int [] res = new int[array.length];

        for(int i = 0; i < array.length; i++)
            res[i] = -array[i];
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,-1,0};
        int[] nuArray = invert(arr);
        System.out.println(invert(arr));
        for ( int nu: invert(arr)) {
            System.out.println(nu);
        }
    }

}