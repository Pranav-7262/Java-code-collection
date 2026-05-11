import org.testng.annotations.Test;

public class TestNgEg {
    @Test(priority = 1)
    public void loginTest() {
        System.out.println("Login Test");
    }
    @Test(priority = 3)
    public void logoutTest() {
        System.out.println("Logout Test");
    }
    @Test(priority = 2)
    public void addToCartTest() {
        System.out.println("Add To Cart Test");
    }

}
