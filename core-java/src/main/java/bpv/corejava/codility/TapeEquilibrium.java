package bpv.corejava.codility;

import java.math.BigInteger;

public class TapeEquilibrium {
    public static int find(int[] A) {
        // write your code in Java SE 8

        BigInteger part1 = BigInteger.valueOf(A[0]);
        BigInteger part2 = BigInteger.valueOf(0);
        for(int i=1;i<A.length;i++){
            part2 = part2.add(BigInteger.valueOf(A[i]));
        }
        int minDiff = Math.abs(part1.subtract(part2).intValue());
        for(int i=1;i<A.length;i++){
            int diff = Math.abs(part1.subtract(part2).intValue());
            if(diff < minDiff){
                minDiff = diff;
            }
            BigInteger n = BigInteger.valueOf(A[i]);
            part1 = part1.add(n);
            part2 = part2.subtract(n);
        }

        return minDiff;

    }
}
