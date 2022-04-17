package bpv.corejava.collectiions;

import bpv.corejava.collections.LongestSubArrayBySum;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LongestSubArrayBySumTest {

    @Test
    public void testFound(){
        List<Integer> list = Arrays.asList(3,5,0,0,8,9,10);
        Assert.assertTrue(Arrays.equals(new int[]{1,4},LongestSubArrayBySum.find(list,8)));
    }

    @Test
    public void testFoundMultiple(){
        List<Integer> list = Arrays.asList(3,5,0,0,1,1,1,1,1,1,1,1,8,9,10);
        Assert.assertTrue(Arrays.equals(new int[]{3,12},LongestSubArrayBySum.find(list,8)));
    }

    @Test
    public void testNotFound(){
        List<Integer> list = Arrays.asList(3,5,0,0,8,9,10);
        Assert.assertFalse(Arrays.equals(new int[]{1,4},LongestSubArrayBySum.find(list,20)));
    }
}
