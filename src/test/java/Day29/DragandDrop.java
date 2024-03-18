package Day29;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragandDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
        driver.navigate().to(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();

        Actions act=new Actions(driver);
        //rome to italy
        WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
        act.dragAndDrop(rome,italy).perform();

        //Washington to USA
        WebElement wash=driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement usa=driver.findElement(By.xpath("//div[@id='box103']"));
        act.dragAndDrop(wash,usa).perform();

        //Madrid to spain
        WebElement madrid=driver.findElement(By.xpath("//div[@id='box7']"));
        WebElement spain=driver.findElement(By.xpath("//div[@id='box107']"));
        act.dragAndDrop(madrid,spain).perform();

        //seoul to south korea
        WebElement seoul=driver.findElement(By.xpath("//div[@id='box5']"));
        WebElement skorea=driver.findElement(By.xpath("//div[@id='box105']"));
        act.dragAndDrop(seoul,skorea).perform();

        //oslo to norway
        WebElement oslo=driver.findElement(By.xpath("//div[@id='box1']"));
        WebElement norway=driver.findElement(By.xpath("//div[@id='box101']"));
        act.dragAndDrop(oslo,norway).perform();

        //stockholm to denmark
        WebElement stock=driver.findElement(By.xpath("//div[@id='box2']"));
        WebElement sweden=driver.findElement(By.xpath("//div[@id='box102']"));
        act.dragAndDrop(stock,sweden).perform();

        //copen to denmark
        WebElement copen=driver.findElement(By.xpath("//div[@id='box4']"));
        WebElement denmark=driver.findElement(By.xpath("//div[@id='box104']"));
        act.dragAndDrop(copen,denmark).perform();

        String exptitle="Demo 2: Drag and drop";
        if (title.equals(exptitle)){
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }








    }
}
