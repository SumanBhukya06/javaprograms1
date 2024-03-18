package Day35;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {
    @Test
    void test()
    {
       // int a=10;
        //int b=10;
        /*if (a==b){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }*/
        //Assert.assertEquals(a,b);
        //Assert.assertTrue(true);
       // Assert.assertTrue(false);
        //int c=20;
       // int d=10;
       // Assert.assertEquals(c>d,true,"c is less than d");//false






        String s1="xyz";
        String s2="abc";
        //Assert.assertNotEquals(s1,s2);//pass
        //Assert.assertEquals(s1,s2);
        //Assert.assertEquals(s1>s2,"true",);
        if (false)
        {
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(true);
        }

    }
}
