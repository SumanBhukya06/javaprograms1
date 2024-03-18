package Day28;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class blazeDemoEndtoEnd {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //URl
        String url="https://blazedemo.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        //Departure city
        driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("Paris");

        //Destination City
        driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys("London");

        //Find Flights Button
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

        //No of rows
        int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
        System.out.println("No of rows are:"+rows);

        //Capture prices and store it in a array
        String pricesArr[]=new String[rows];
        for (int i=1;i<=rows;i++)
        {
            String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]/td[6]")).getText();
            pricesArr[i-1]=price;
        }
        //Sort prices then find the lowest price
        for (String pr:pricesArr){
            System.out.println(pr);
        }
        Arrays.sort(pricesArr);
        String lwprice=pricesArr[0];
        System.out.println("Lowest price:"+lwprice);

        //Find record in table which have lowest value
        for (int i=1;i<=rows;i++)
        {
            String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]/td[6]")).getText();
            if (price.equals(lwprice))
            {
                driver.findElement(By.xpath("//table[@class='table']//tbody//tr//td[1]//input")).click();
                break;
            }
        }
        Thread.sleep(5000);
        //Name
        driver.findElement(By.id("inputName")).sendKeys("Wadiyar");

        //Address
        driver.findElement(By.name("address")).sendKeys("Bangalore Palace");

        //City
        driver.findElement(By.id("city")).sendKeys("Bengaluru");

        //State
        driver.findElement(By.id("state")).sendKeys("Karnataka");

        //ZipCode
        driver.findElement(By.id("zipCode")).sendKeys("500367");

        //card type
        driver.findElement(By.xpath("//select[@class='form-inline']")).sendKeys("Visa");

        //Card Number
        driver.findElement(By.name("creditCardNumber")).sendKeys("12456789789");

        //Month
        driver.findElement(By.name("creditCardMonth")).sendKeys("04");

        //Year
        driver.findElement(By.name("creditCardYear")).sendKeys("2024");

        //Name on card
        driver.findElement(By.name("nameOnCard")).sendKeys("Srikanth wadiyar");

        //Purchase Flight
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

        //Validation
        String msz=driver.findElement(By.xpath("//h1")).getText();
        if (msz.equals("Thank you for your purchase today!")){
            System.out.println("Success !!!");
        }
        else {
            System.out.println("Failed");
        }
        driver.quit();

    }
}
