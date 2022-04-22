package bpv.corejava.codility;

import java.util.Arrays;

public class MaxProductOfThree {
    public static int find(int[] A) {
        Arrays.sort(A);
        int size = A.length;
        int result = A[size-1] * A[size-2] * A[size-3];
        int negative_result = result;
        if(A[0] < 0 && A[1] < 0){
            negative_result = A[0] * A[1] * A[size-1];
        }
        return negative_result > result ? negative_result : result;
    }
}
