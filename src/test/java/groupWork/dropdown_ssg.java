package groupWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class dropdown_ssg extends TestBase {
    @Test
    public void dropdDownTest01() {
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

        // Menüde 3 elemanın seçili olduğunu doğrula
        List<WebElement> seciliKahramanlar = select.getAllSelectedOptions();
        Assert.assertEquals(3, seciliKahramanlar.size());

        // Menüde seçili elemanların isimlerini doğrula
        for (WebElement kahraman : seciliKahramanlar) {
            Assert.assertTrue(kahraman.getText().equals("Aquaman")
                    || kahraman.getText().equals("The Avengers")
                    || kahraman.getText().equals("Batman"));
        }

        // Seçili elemanlardan birinin seçimini kaldır
        select.deselectByIndex(1);

        bekle(3);

    }
}
