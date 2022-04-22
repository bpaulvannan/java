package bpv.corejava.codility;

/**
 * Codility
 */
public class MaxCounters {
    public int[] solution(int N, int[] input) {
        int A[] = new int[N];
        int max = 0;
        int maxPos = 0;
        int lastMax = 0;
        boolean reset = false;
        for(int i : input){
            int v = i -1;
            if(1 <= i && i <= N){
                if(reset && A[v] < lastMax){
                    A[v] = lastMax;
                }
                A[v] = A[v] + 1;
                if(max < A[v]){
                    max = A[v];
                    maxPos = v;
                }
            }else if( i == N + 1){
                reset = true;
                lastMax = max;
            }
        }
        for(int p = 0; p<A.length;p++){
            if(A[p] < lastMax){
                A[p] = lastMax;
            }
        }
        return A;
    }
}
