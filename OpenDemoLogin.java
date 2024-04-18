package UTubePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDemoLogin {
    public static void main(String[] args) throws InterruptedException {
       /* Assignement
                ----------------
        1) Launch browser
        2) open url
        URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
        3) Provide username  - admin@yourstore.com
        4) Provide password  - admin
        5) Click on Login button
        6) Verify the title of dashboard page
        Exp title : Dashboard / nopCommerce administration
        7) Verify Dasboad*/
        //Launch browser
        WebDriver driver=new ChromeDriver();

        //URl
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //LocateUserName
        WebElement username=driver.findElement(By.name("Email"));
        username.clear();
        username.sendKeys("admin@yourstore.com");

        //LocatePassword
        WebElement pass=driver.findElement(By.name("Password"));
        pass.clear();
        pass.sendKeys("admin");

        //LoginButton
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
        String actu_title=driver.getTitle();
        String expe_title="Dashboard / nopCommerce administration";
        if (actu_title.equals(expe_title))
        {
            System.out.println("Test is Passed");
        }
        else {
            System.out.println("Test is Failed");
        }

        driver.quit();





    }
}
