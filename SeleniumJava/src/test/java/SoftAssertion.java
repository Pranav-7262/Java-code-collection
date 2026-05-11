import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    Demo demo = new Demo(22,99.8F);
    @Test
    public void testSoftAssertion() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(3+4, 7);
        softAssert.assertNotNull(demo.getName());
  softAssert.assertEquals(demo.add(6,4),10);
        System.out.println("DONEEEE");
        softAssert.assertAll();
    }
}
