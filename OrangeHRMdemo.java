import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrangeHRMdemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("Admin123");
        driver.findElement(By.xpath("//*[@id=app/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        String title =driver.getTitle();
        String exp_title="OrangeHRM";
        if (title.equals(exp_title))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
       // driver.close();
        driver.quit();


    }
}
