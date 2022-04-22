package bpv.corejava.codility;

/**
 *
 *  We only need to check sub slices of size 2 or 3
 *  Because subslices larger than 3 are created from sub slices of size 2 or 3
 *
 */
public class MinAvgTwoSlice {
    public static int find(int[] A) {
        int result = 0;
        double minAvg = Double.MAX_VALUE;
        for(int i=0;i<A.length-1;i++){
           double avgOfTwoElements = (A[i] + A[i+1]) / 2d;
           if(avgOfTwoElements < minAvg) {
               minAvg = avgOfTwoElements;
               result = i;
           }
           if(i<A.length -2) {
               double avgOfThreeElements = (A[i] + A[i + 1] + A[i + 2]) / 3d;
               if (avgOfThreeElements < minAvg) {
                   minAvg = avgOfThreeElements;
                   result = i;
               }
           }
        }
        return result;
    }
}
