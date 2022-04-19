package bpv.corejava.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class RepeatingCharsTest {
    @Test
    public void test(){
        Set<Character> expected = new HashSet<>();
        expected.add('a');
        expected.add('n');
        Assert.assertEquals(expected, RepeatingChars.find("Paulvannan"));
        Assert.assertEquals(new HashSet<>(), RepeatingChars.find("abcdefghi"));
    }
}
