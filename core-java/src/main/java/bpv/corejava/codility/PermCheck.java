package bpv.corejava.codility;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/***
 * Codility
 */
public class PermCheck {
    public int solution(int[] A) {
        Set<Integer> tracker = new HashSet<>();
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger total = BigInteger.valueOf(A.length).multiply(BigInteger.valueOf(A.length).add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));
        for(int n : A){
            if(!tracker.add(n)) return 0;
            sum = sum.add(BigInteger.valueOf(n));
        }
        return tracker.size() == A.length && total.equals(sum) ? 1 : 0;
    }
}
