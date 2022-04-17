package bpv.corejava.collectiions;

import bpv.corejava.collections.SumOfTwo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SumOfTwoTest {
    @Test
    public void testFound(){
        Assert.assertTrue(
            SumOfTwo.isAvailable(
                    Arrays.asList(1,3,5,6,7,8),
                    Arrays.asList(7,9,3,6,4,9),
                    14
            )
        );

        Assert.assertTrue(
                SumOfTwo.isAvailable(
                        Arrays.asList(1,-3,5,6,7,-8),
                        Arrays.asList(7,9,-3,6,-4,9),
                        -12
                )
        );
    }
    @Test
    public void testNotFound(){
        Assert.assertTrue(
                SumOfTwo.isAvailable(
                        Arrays.asList(1,3,5,6,7,8),
                        Arrays.asList(7,9,3,6,4,9),
                        1
                )
        );
        Assert.assertTrue(
                SumOfTwo.isAvailable(
                        Arrays.asList(1,-3,5,6,7,-8),
                        Arrays.asList(7,9,-3,6,-4,9),
                        -30
                )
        );
    }
}
