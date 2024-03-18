package Day28;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DummyticketBookingEndtoEnd {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //URL
        String url="https://www.dummyticket.com/dummy-ticket-for-visa-application/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        //Select radio button for fare
        WebElement faret=driver.findElement(By.xpath("//input[@id='product_550']"));
        faret.click();
        //faret.getText();

        //Passenger Details
        //First Name field
        WebElement fn=driver.findElement(By.xpath("//input[@id='travname']"));
        fn.sendKeys("Prince");

        //Last Name field
        WebElement ln=driver.findElement(By.xpath("//input[@id='travlastname']"));
        ln.sendKeys("Uday");


        //Dob
       /* WebElement dob=driver.findElement(By.xpath("//input[@id='dob']"));
        dob.click();

        //Click on the dropdown
        Select monthlist=new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));*/


        //Get the month list dropdown text
        /*for (int i=0;i<= monthlist.size();i++)
        {
            System.out.println(monthlist.get(i).getText());
            if (monthlist.get(i).equals("Jan")){
                monthlist.get(i).click();
            }
        }*/
        //Sex radio button
        driver.findElement(By.id("sex_1")).click();

        //Add more passengers
       // driver.findElement(By.id("addmorepax")).click();

        //Travel Details
        driver.findElement(By.xpath("//input[@id='traveltype_1']")).click();

        //Origin/From city
        driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Hyderbad");

        //Destination city
        driver.findElement(By.xpath("//input[@id='tocity']"));

        //Billing Details person name
        driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("MahaRaja");

        //Phone
        driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("987456130");

        //Email
        driver.findElement(By.xpath("//input[@name='billing_email']")).sendKeys("maha@gmail.com");

        //Street address
        driver.findElement(By.xpath("//input[@name='billing_address_1']")).sendKeys("bangalore");

        //Town
        driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Mahadevapura");

        //Postcode
        driver.findElement(By.xpath("//input[@name='billing_postcode']")).sendKeys("123456");



























    }
}
