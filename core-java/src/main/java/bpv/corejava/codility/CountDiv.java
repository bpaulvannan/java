package bpv.corejava.codility;

import java.math.BigInteger;

public class CountDiv {
    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int remA = A%K;
        int start = remA == 0? A : A + (K - remA);

        int remB = B%K;
        int end = remB == 0? B : B-remB;

        int diff = BigInteger.valueOf(end).subtract(BigInteger.valueOf(start)).intValue();
        int result = diff/K;
        return result + 1;
    }
}
