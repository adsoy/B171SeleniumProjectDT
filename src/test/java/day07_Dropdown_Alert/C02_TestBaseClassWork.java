package day07_Dropdown_Alert;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C02_TestBaseClassWork extends TestBase {

    @Test
    public void test01() {
        //Techproeducation sayfasina gidin
        driver.get("https://www.techproeducation.com/");
        bekle(2);

        //Arama kutusuna java yazdiralim
        driver.findElement(By.cssSelector("#searchHeaderInput")).sendKeys("Java");


    }
}
