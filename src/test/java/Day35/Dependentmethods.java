package Day35;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependentmethods {
    @Test(priority = 1)
    void setup()
    {
        System.out.println("This is setup method.");
        Assert.assertTrue(true);
    }
    @Test(priority = 2,dependsOnMethods = {"setup"})
    void login()
    {
        System.out.println("This is login method.");
        Assert.assertTrue(true);

    }
    @Test(priority = 3,dependsOnMethods = {"login"})
    void search()
    {
        System.out.println("This is search method.");
        Assert.assertTrue(false);
    }
    @Test(priority = 4,dependsOnMethods = {"login","search"})
    void logout()
    {
        System.out.println("This is logout method");
        Assert.assertTrue(true);
    }
    @Test(priority = 5,dependsOnMethods = {"logout"})
    void logout1()
    {
        System.out.println("This is closing app method.");
        Assert.assertTrue(true);
    }
}
