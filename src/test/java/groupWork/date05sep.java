package groupWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class date05sep extends TestBase {  // automation exercise task 10
    @Test
    public void test01() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homeButton=driver.findElement(By.xpath("//*[@style='color: orange;']"));
        Assert.assertTrue(homeButton.isDisplayed());

        //4. Scroll down to footer
        WebElement footerElement=driver.findElement(By.xpath("(//div[@class='row'])[5]"));
        Actions actions=new Actions(driver);
        actions.scrollToElement(footerElement).build().perform();

        //5. Verify text 'SUBSCRIPTION'
        WebElement subscriptionElement=driver.findElement(By.xpath("//h2[text()='Subscription']"));
        Assert.assertEquals("SUBSCRIPTION",subscriptionElement.getText());


        //6. Enter email address in input and click arrow button
        WebElement emailBox=driver.findElement(By.id("susbscribe_email"));
        emailBox.sendKeys("baltat@gmail.com");

        driver.findElement(By.xpath("//*[@id='subscribe']")).click();

        //7. Verify success message 'You have been successfully subscribed!' is visible

        WebElement text=driver.findElement(By.xpath("//*[@text()='You have been successfully subscribed!']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollDown;",text);


        Assert.assertEquals("You have been successfully subscribed!",text.getText());


    }

    @Test
    public void test02() {
        driver.get("https://amazon.com");
        driver.navigate().refresh();
        bekle(3);
        WebElement son=driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine navFooterCopyright']"));
        jsScroll(son);
    }
}