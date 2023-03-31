import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMinMax {
    public static void main(String[] args) {
        int ar[] = {7, 100, 5, -3, 6, 4};
        int max = 0;
        int min = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
            if (ar[i] < min) {
                min = ar[i];
            }
        } //N
        System.out.printf(min + " " + max);

//        Arrays.sort(ar); //NLogN
//        System.out.printf(ar[0] + " " + ar[ar.length-1]);
    }
}
