package exercises;

public class CalculateIndex {
    public static void main(String[] args) {

        //
        float[] in = {1,2,4,5,6};
        //{1,2,4,5};  n = 4  ;  n-1 = 3
        //{1,2,4,5,6};  n = 5  ;  n-1 = 4

        System.out.println(in.length);
        //c. len = n-1
        //b. len = n
        float len = 5;

        float middleIndex = len / 2;

        System.out.println(middleIndex);

        if(len%2 != 0){
            middleIndex = (float) (middleIndex - 0.5);
        }
        System.out.println("middle" + middleIndex);
    }
}
