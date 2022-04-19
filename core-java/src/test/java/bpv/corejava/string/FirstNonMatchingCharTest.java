package bpv.corejava.string;

import org.junit.Assert;
import org.junit.Test;

public class FirstNonMatchingCharTest {
    @Test
    public void testNonRepeating(){
        Assert.assertEquals(new Character('P'), FirstNonMatchingChar.find("Paulvannan"));
        Assert.assertEquals(new Character('e'), FirstNonMatchingChar.find("abcdeabcd"));
        Assert.assertEquals(null, FirstNonMatchingChar.find("aabbcc"));
    }
}
