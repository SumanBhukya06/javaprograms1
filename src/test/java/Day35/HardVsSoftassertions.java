package Day35;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftassertions {

   // @Test
    void HardAssertions()
    {
        System.out.println("Tes1");
        System.out.println("Tes1");
        System.out.println("Tes1");
        System.out.println("Tes1");
        System.out.println("Tes1");

        //Assert.assertEquals(1,1);//pass
        Assert.assertEquals(1,2);//if is failed it won't go to the next statements
        System.out.println("Hard Assertion is completed...");
    }
    @Test
    void SoftAssertions()
    {
        System.out.println("Test1");
        System.out.println("Test1");
        System.out.println("Test1");
        SoftAssert as=new SoftAssert();
        as.assertEquals(1,2);//if it is fails also remain statements will work
        System.out.println("Soft assertion is completed...");
        as.assertAll();
    }
}
