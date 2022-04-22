package bpv.corejava.codility;

import org.junit.Assert;
import org.junit.Test;

public class MinAvgTwoSliceTest {
    @Test
    public void test(){
        Assert.assertEquals(2,MinAvgTwoSlice.find(new int[]{5, 6, 3, 4, 9}));
        Assert.assertEquals(1,MinAvgTwoSlice.find(new int[]{4, 2, 2, 5, 1, 5, 8}));

    }
}
