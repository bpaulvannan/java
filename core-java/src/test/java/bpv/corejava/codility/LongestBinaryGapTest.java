package bpv.corejava.codility;

import org.junit.Assert;
import org.junit.Test;

public class LongestBinaryGapTest {

    @Test
    public void test(){
        Assert.assertEquals(0, LongestBinaryGap.find(8));
        Assert.assertEquals(0,LongestBinaryGap.find(32));
        Assert.assertEquals(1,LongestBinaryGap.find(20));
        Assert.assertEquals(5,LongestBinaryGap.find(1041));
    }
}
