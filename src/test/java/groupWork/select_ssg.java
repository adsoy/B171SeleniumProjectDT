package groupWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class select_ssg {
    WebDriver driver;
    @Test
    public void test01() {
        // LetCode sitesine git

        driver.get("https://letcode.in/dropdowns");

        // Meyveler menüsünün tıklanabilir olduğunu doğrula
        WebElement meyveler = driver.findElement(By.id("fruits"));
        Assert.assertTrue(meyveler.isEnabled());

        // Meyveler menüsünden Apple seçeneğini görünen metin ile seç
        Select select = new Select(meyveler);
        select.selectByVisibleText("Apple");

        // Seçilen seçeneğin Apple olduğunu doğrula
        String apple = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Apple", apple);

        // Menüde seçilen seçeneği yazdır
        System.out.println("Menüde Seçili Olan Seçenek: " + apple);
    }
}
