package Day24;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://total-qa.com/checkbox-example/#google_vignette");
        driver.manage().window().maximize();
        //driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Select specific check box
       // driver.findElement(By.xpath("//option[@value='canada']")).click();

        //total number of checkboxes
        //List<WebElement> handle=driver.findElements(By.xpath("//select[@class='form-control' and @id='country']"));
        List <WebElement> checkb=driver.findElements(By.xpath("//input[@type='checkbox' and @name='chk']"));
        System.out.println("The total no of checkboxes:"+checkb.size());

        //Select all checkboxes
       /* for (int i=0;i<=checkb.size();i++)
        {
            checkb.get(i).click();
        }*/

        //Enhanced for loop
       /* for (WebElement Checkbo:checkb)
        {
            Checkbo.click();
        }*/
        //Select last 2 checkboxes
        /*for (int i=2;i<= checkb.size();i++)
        {
            checkb.get(i).click();
        //Thread.sleep(5000);*/

       // driver.quit();

        //Select first 2 checkboxes
       /* for (int i=0;i<2;i++)
        {
            checkb.get(i).click();
        }*/
        //first select all the checkboxes
        /*for (int i=0;i<= checkb.size();i++)
        {
            checkb.get(i).click();
        }
        Thread.sleep(3000);*/
        // deselect all the checkboxes
        /*for (int i=0;i<= checkb.size();i++)
        {
            if(checkb.get(i).isSelected()){
                checkb.get(i).click();


            }*/
       /* for (WebElement checkBox:checkb)
        {
            if (checkBox.isSelected())
            {
                checkBox.click();
            }*/


        // 3 check boxes are selected and deselect them
        for (int i=0;i<2;i++)
        {
            checkb.get(i).click();
        }
        Thread.sleep(2000);
        for (int i=0;i< checkb.size();i++)
        {
            if (checkb.get(i).isSelected()){
                checkb.get(i).click();
            }
        driver.quit();
        }
        }
        }



