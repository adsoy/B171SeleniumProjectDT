package day10_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_ActionsTest extends TestBase {

    @Test
    public void action() {

        //Amazon a gidelim https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        bekle(2);


        //Sag ust bolumde bulunan "Account & Lists" menüsüne git  "Account" secenegine tikla
        WebElement accountListWE = driver.findElement(By.xpath("//*[ @class='nav-line-2 ']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountListWE).perform();//Mouse'u Locate ettigimiz webelement'in uzerine goturduk
        bekle(2);
        driver.findElement(By.xpath("//span[.='Account']")).click();

        //Acilan sayfanin Title in "Your Account" icerdigini dogrula
        Assert.assertEquals("Your Account", driver.getTitle());

    }
}