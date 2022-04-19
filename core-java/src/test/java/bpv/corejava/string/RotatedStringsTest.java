package bpv.corejava.string;

import org.junit.Assert;
import org.junit.Test;

public class RotatedStringsTest {
    @Test
    public void test(){
        Assert.assertTrue( RotatedStrings.isRotated("abc","bca"));
        Assert.assertFalse( RotatedStrings.isRotated("abcd","bcad"));
    }
}
