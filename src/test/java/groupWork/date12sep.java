package groupWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class date12sep extends TestBase {
    @Test
    public void test01() {
        driver.get("https://automationexercise.com");

        Assert.assertTrue(driver.getTitle().contains("Automation Exercise") );

        WebElement anyProduct= driver.findElement(By.xpath(("//a[@style='color: brown;'])[1]")));
        anyProduct.click();


    }
}
