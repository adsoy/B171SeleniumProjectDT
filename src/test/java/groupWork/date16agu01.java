package groupWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class date16agu01 {

    public static void main(String[] args) throws InterruptedException {
        //1 launch browser
        //3 maximize browser
        //4 do implicitly wait 15sn
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2 open url https://amazon.com/
        driver.get("https://amazon.com/");

        //5 take locate search box
        //6 enter search text -iphone
        // 7 click search button please do 2 different ways

        WebElement searchtextbox=driver.findElement(By.id("twotabsearchtextbox"));
        //searchtextbox.sendKeys("iphone"+Keys.ENTER);

        searchtextbox.sendKeys("iphone");
        searchtextbox.submit();


        //8 wait for page to load
        Thread.sleep(3000);

        //9 click on first result
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
        //driver.findElement(By.xpath("(//img[@class='s-image'])[1]")); //img nin locate i

        //10 wait for page to load
        Thread.sleep(3000);

        //11 click on second result
        driver.findElement(By.xpath("(//img[@class='s-image'])[2]"));

        //12 wait for page to load
        Thread.sleep(3000);

        //13 close driver
        driver.close();

    }//main
}//class