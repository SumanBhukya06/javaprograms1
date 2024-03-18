import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBdemo {
    public static void main(String[] args) throws InterruptedException {
        //Launch Browser
        WebDriver driver= new ChromeDriver();
        //Navigate to website
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
        //username
        driver.findElement(By.name("email")).sendKeys("7386895202");
        driver.findElement(By.name("pass")).sendKeys("Suman@4204");
        driver.findElement(By.name("login")).click();

        String act_title=driver.getTitle();
        String exp_title="Facebook – log in or sign up";

        if (act_title.equals(exp_title))
        {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        //driver.close();
        driver.close();


    }
}
