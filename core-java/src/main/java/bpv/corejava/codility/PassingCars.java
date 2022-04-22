package bpv.corejava.codility;

import java.math.BigInteger;

public class PassingCars {
    public static int find(int[] A){
        int count = A.length;
        if(count < 2) return 0;
        BigInteger passingCars = BigInteger.valueOf(0);
        int factor = 0;
        boolean eastFound = false;
        boolean westFound = false;
        for(int dir : A){
            if(dir == 0 ){
                eastFound = true;
                factor = factor + 1;
            }
            if(eastFound && dir == 1){
                westFound = true;
            }
            if(eastFound && westFound && dir == 1){
                passingCars = passingCars.add(BigInteger.valueOf(factor));
            }
        }
        return passingCars.compareTo(new BigInteger("1000000000")) > 0 ? -1 : passingCars.intValue();
    }
}
