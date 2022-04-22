package bpv.corejava.codility;

public class GenomicRangeQuery {

    public static int[] brutForce(String S, int[] P, int[] Q){
        char[] dna = S.toCharArray();
        int[] result = new int[P.length];
        for(int i=0;i<P.length;i++){
            int factor = 4;
            for(int j=P[i];j<=Q[i];j++){
                switch(dna[j]){
                    case 'A':
                        factor = 1;
                        break;
                    case 'C':
                        if(factor > 2) factor = 2;
                        break;
                    case 'G':
                        if(factor > 3) factor = 3;
                        break;
                }
                if(factor == 1){
                    break;
                }
            }
            result[i] = factor;
        }
        return result;
    }

    /**
     * For example, consider string S = CAGCCTA and arrays P, Q such that:
     *
     *     P[0] = 2    Q[0] = 4
     *     P[1] = 5    Q[1] = 5
     *     P[2] = 0    Q[2] = 6
     *
     *     0 1 2 3 4 5 6
     *     C A G C C T A
     *                                                                             0  1  2  3  4  5  6
     *    Occurrences of A -> cache[0] = [0, 1, 0, 0, 0, 0, 1] -> prefix sum = [0, 0, 1, 1, 1, 1, 1, 2]
     *    Occurrences of C -> cache[1] = [1, 0, 0, 1, 1, 0, 0] -> prefix sum = [0, 1, 1, 1, 2, 3, 3, 3]
     *    Occurrences of G -> cache[2] = [0, 0, 1, 0, 0, 0, 0] -> prefix sum = [0, 0, 0, 1, 1, 1, 1, 1]
     *
     *    between 2 and 4
     *    Since first sum is 0, add 1 to 4 -> 5
     *    start = 2, end = 5
     *       -> A occurs when sum[0][5] - sum[0][2] > 0
     *       -> C occurs when sum[1][5] - sum[1][2] > 0
     *       -> G occurs when sum[2][5] - sum[2][2] > 0
     *       -> otherwise T occurs
     *
     * @param S
     * @param P
     * @param Q
     * @return
     */
    public static int[] usingCache(String S, int[] P, int[] Q) {
        char[] dna = S.toCharArray();
        int[] result = new int[P.length];
        int[][] sumOfOccurrences = new int[3][S.length()+1];
        for(int i = 0; i < dna.length; i++){
            char ch = dna[i];
            int a = 0,c = 0,g = 0;
            if(ch == 'A') a = 1;
            else if(ch == 'C') c = 1;
            else if(ch == 'G') g = 1;
            sumOfOccurrences[0][i+1] =  sumOfOccurrences[0][i] + a ;
            sumOfOccurrences[1][i+1] =  sumOfOccurrences[1][i] + c ;
            sumOfOccurrences[2][i+1] =  sumOfOccurrences[2][i] + g ;
        }
        for(int i=0;i< P.length;i++){
            int start = P[i];
            int end = Q[i]+1;
            int min = 4;
            if((sumOfOccurrences[0][end] - sumOfOccurrences[0][start]) > 0){
                min = 1;
            }else if((sumOfOccurrences[1][end] - sumOfOccurrences[1][start]) > 0){
                min = 2;
            }else if((sumOfOccurrences[2][end] - sumOfOccurrences[2][start]) > 0){
                min = 3;
            }
            result[i] = min;
        }
        return result;
    }
}
