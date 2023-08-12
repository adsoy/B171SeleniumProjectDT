package udemy;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.concurrent.TimeUnit;

public class GroupWork_01 extends TestBase {


    @Test
    public void test01() throws InterruptedException {
        //1 launch browser
        driver.get("https://amazon.com/");
        //2 maximize browser
        driver.manage().window().maximize();
        //3 do implicitly wait 15sn
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //take locate search box
        WebElement searchTextBox= driver.findElement(By.id("twotabsearchtextbox"));
        //enter search text -iphone

        //click search button please do 2 different ways
        searchTextBox.sendKeys("iphone");
        searchTextBox.submit();
        //2. YOL
        // searchTextBox.sendKeys("ihphone"+Keys.ENTER);

        //wait for page to load
        Thread.sleep(3000);

        //click on first result
        WebElement iphone = driver.findElement(By.xpath("//*[@class='a-section aok-relative s-image-fixed-height']"));
        iphone.click();


        //wait for page to load
        Thread.sleep(3000);
        driver.navigate().back();

        //click on second result
        WebElement iphone2 = driver.findElement(By.xpath("//*[@class='s-image'][2]"));
        iphone2.click();

        //wait for page to load
        Thread.sleep(3000);
        driver.navigate().back();

        //close driver
        driver.quit();



    }



        /*
    1 launch browser
    2 open url https://amazon.com/
    3 maximize browser
    4 do implicitly wait 15sn
    5 take locate search box
    6 enter search text -iphone
    7 click search button please do 2 different ways
    8 wait for page to load
    9 click on first result
    10 wait for page to load
    11 click on second result
    12 wait for page to load
    13 close driver

     */
        //1 launch browser


    }

