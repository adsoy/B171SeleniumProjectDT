package groupWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class select_ssg2 {
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

    @Test
    public void test02() {
        /*
Test Görevi - 4:
    letcode.in/dropdowns adresine gidin.
    Kahramanlar menüsünün, çoklu seçim yapılabilen bir menü olduğunu doğrulayın.
    Kahramanlar menüsünden 3 tane kahramanı index numaraları ile seçin.
    Menüde 3 elemanın seçili olduğunu doğrulayın.
    Menüde seçili elemanların isimlerini doğrulayın.
    Seçili elemanlardan birinin seçimini kaldırın.
    Menüde 2 elemanın seçili olduğunu doğrulayın.
    Menüde seçili elemanlarının isimlerini doğrulayın.
    Seçili elemanların hepsinin seçimini kaldırın.
    Menüde hiçbir elemanın seçili olmadığını doğrulayın.
 */
            /*
        Test Görevi - 4:
            letcode.in/dropdowns adresine gidin.
            Kahramanlar menüsünün, çoklu seçim yapılabilen bir menü olduğunu doğrulayın.
            Kahramanlar menüsünden 3 tane kahramanı index numaraları ile seçin.
            Menüde 3 elemanın seçili olduğunu doğrulayın.
            Menüde seçili elemanların isimlerini doğrulayın.
            Seçili elemanlardan birinin seçimini kaldırın.
            Menüde 2 elemanın seçili olduğunu doğrulayın.
            Menüde seçili elemanlarının isimlerini doğrulayın.
            Seçili elemanların hepsinin seçimini kaldırın.
            Menüde hiçbir elemanın seçili olmadığını doğrulayın.
         */

        // LetCode sitesine git
        driver.get("https://letcode.in/dropdowns");

        // Kahramanlar menüsünün, çoklu seçim yapılabilen bir menü olduğunu doğrula
        WebElement kahramanlar = driver.findElement(By.id("superheros"));
        Select select = new Select(kahramanlar);
        Assert.assertTrue(select.isMultiple());

        // Kahramanlar menüsünden 3 tane kahramanı index numaraları ile seç
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);

        // Menüde seçili elemanların isimlerini doğrula
        List<WebElement> seciliKahramanlarListesi = select.getAllSelectedOptions();
        for (WebElement kahraman : seciliKahramanlarListesi) {
            Assert.assertTrue(kahraman.getText().equals("Aquaman")
                    || kahraman.getText().equals("The Avengers")
                    || kahraman.getText().equals("Batman"));
        }

        // Seçili elemanlardan birinin seçimini kaldır
        select.deselectByIndex(1);

    }

    public void selectIndex(WebElement webElement, int... indexes) {
        Select select = new Select(webElement);
        for (int index : indexes) {
            select.selectByIndex(index);

    }
    }
}


