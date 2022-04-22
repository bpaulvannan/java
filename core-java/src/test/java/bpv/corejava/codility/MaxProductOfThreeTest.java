package bpv.corejava.codility;

import org.junit.Assert;
import org.junit.Test;

public class MaxProductOfThreeTest {
    @Test
    public void test(){
        Assert.assertEquals(125, MaxProductOfThree.find(new int[]{-5, 5, -5, 4}));
    }
}
