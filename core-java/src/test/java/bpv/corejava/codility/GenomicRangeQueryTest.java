package bpv.corejava.codility;

import org.junit.Test;

public class GenomicRangeQueryTest {
    @Test
    public void test(){
        //'GT', [0, 0, 1], [0, 1, 1]
        //GenomicRangeQuery.brutForce("GT", new int[]{0,0,1}, new int[]{0,1,1});
        //GenomicRangeQuery.usingCache("GT", new int[]{0,0,1}, new int[]{0,1,1});
        GenomicRangeQuery.usingCache("A", new int[]{0}, new int[]{0});
    }
}
