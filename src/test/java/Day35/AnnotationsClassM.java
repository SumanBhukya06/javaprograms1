package Day35;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsClassM {
    @BeforeClass
    void homepage()
    {
        System.out.println("Welcome to Home Page");
    }
    @Test(priority = 1)
    void loginpage()
    {
        System.out.println("Enter Your Credentials");
    }
    @Test(priority = 2)
    void validation()
    {
        System.out.println("Under Progress");
    }
    @AfterClass
    void success()
    {
        System.out.println("Successfully logged in");
    }
}
