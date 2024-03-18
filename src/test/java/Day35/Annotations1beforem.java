package Day35;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1beforem {
    @BeforeMethod
    void login()
    {
        System.out.println("Before Method:");
        System.out.println("Welocme to my page...");
    }
    @Test(priority = 1)
    void search()
    {
        System.out.println("Something is waiting for u...");
    }
    @Test(priority = 2)
    void advsearch()
    {
        System.out.println("Hurray!!! You found it..");
    }
    @AfterMethod
    void logout()
    {
        System.out.println("After Method:");
        System.out.println("Thank you!!!!");
    }
}

/*Before Method:
Welocme to my page...
Something is waiting for u...
After Method:
Thank you!!!!
Before Method:
Welocme to my page...
Hurray!!! You found it..
After Method:
Thank you!!!!*/
