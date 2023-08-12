package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework02 {

    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");

    }

    @Test
    public void test01() throws InterruptedException {

        //Url'in facebook içerdiğini test(assertion ile)
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));

        //"Create an Account" button'una basin
        driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
        Thread.sleep(3000);
        //Çıkan formu doldurunuz
        driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("Ali", Keys.ENTER,Keys.TAB,"Can",
                Keys.TAB,"alican@alican.com",Keys.TAB,"alican@alican.com",Keys.TAB,Keys.TAB,"01",Keys.TAB,"01",Keys.TAB,"2000");
        driver.findElement(By.xpath("(//*[@class='_58mt'])[1]")).click();
        driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
        Thread.sleep(6000);
    }
    //  After ile sayfayı kapatınız
    @After
    public void tearDown() throws Exception {
        driver.close();
    }

}