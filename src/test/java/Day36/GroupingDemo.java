package Day36;

import org.testng.annotations.Test;

public class GroupingDemo {
    /*
loginByEmail  - sanity & regression
loginByfacebook - sanity
loginBytwitter  - sanity

signupbyemail - sanity & regression
signupbyfacebook  - regression
signupbytwitter  - regression

paymentinrupees - sanity & regression
paymentindollar - sanity
paymentReturnbyBank  - regression
*/
    @Test(priority = 1, groups = {"sanity","regression"})
    void loginByEmail(){
        System.out.println("This is login method..");
    }

    @Test(priority = 2,groups = {"sanity"})
    void loginByfacebook()
    {
        System.out.println("This is login by facebook method...");
    }

    @Test(priority = 3,groups = {"sanity"})
    void loginBytwitter()
    {
        System.out.println("This is login by twitter...");
    }

    @Test(priority = 4,groups = {"sanity","regression"})
    void signupbyemail()
    {
        System.out.println("This is signup by email method...");
    }

    @Test(priority = 5,groups = {"regression"})
    void signupbyfacebook()
    {
        System.out.println("This is signup by facebook method...");
    }

    @Test(priority = 6,groups = {"regression"})
    void signupbytwitter()
    {
        System.out.println("This is signup by twitter method...");
    }

    @Test(priority = 7,groups ={ "sanity","regression"})
    void paymentinrupees()
    {
        System.out.println("This is payment in rupees method...");
    }

    @Test(priority = 8,groups = {"sanity"})
    void paymentindollars()
    {
        System.out.println("This is payment in dollar method...");
    }

    @Test(priority = 9,groups = {"regression"})
    void paymentreturnbyBank()
    {
        System.out.println("This is payment in return bank method,..");
    }

}
