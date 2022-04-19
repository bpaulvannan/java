package bpv.corejava.string;

import org.junit.Assert;
import org.junit.Test;

public class AnagramsTest {
    @Test
    public void testAnagrams(){
        Assert.assertTrue(Anagrams.isAnagramUsingSort("Garden","Danger"));
        Assert.assertTrue(Anagrams.isAnagramUsingCounter("Garden","Danger"));
    }
}
