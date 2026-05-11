import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
    @Test
    public void testAssertion() {
        Assert.assertEquals(2+3, 5);
        Assert.assertTrue(5 > 2);
        Assert.assertFalse(6 < 4);
        Assert.assertSame("pra", "pra");
        System.out.println("all done");
    }
}
