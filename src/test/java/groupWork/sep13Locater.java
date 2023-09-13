package groupWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class sep13Locater extends TestBase {
    @Test
    public void test01() {
        /*
        Test Görevi:
        https://www.kitapyurdu.com/ adresine gidiniz.
        “En Çok Satılanlar” bölümündeki ilk ürünü seçiniz.
        Seçilen ürüne ait sayfanın açıldığını doğrulayınız.
        “Devamını Oku…” butonuna basınız.
        Ürünü sepete ekleyiniz.
        Sepete gidiniz.
        Ürüne ait kontrol kutusunu işaretleyiniz.
        Ürün miktarını değiştiriniz.
         */
        //https://www.kitapyurdu.com/ adresine gidiniz.
        driver.get("https://www.kitapyurdu.com/");

        //“En Çok Satılanlar” bölümündeki ilk ürünü seçiniz.
        List<WebElement> bestSeller = driver.findElements(By.xpath("//li[@class='bestseller-item']"));
        String firstBook= bestSeller.get(0).getText().split("\n")[0];
        bestSeller.get(0).click();
        bekle(2);

        //Seçilen ürüne ait sayfanın açıldığını doğrulayınız.
        WebElement bookName=driver.findElement(By.tagName("h1"));
        Assert.assertEquals(firstBook, bookName.getText());

        //“Devamını Oku…” butonuna basınız.
        WebElement devamButton=driver.findElement(By.partialLinkText("Devamı"));
        devamButton.click();

        //Ürünü sepete ekleyiniz.
        WebElement sepeteEkle=driver.findElement(By.id("button-cart"));
        sepeteEkle.click();

        //Sepete gidiniz.
        WebElement sepeteGit=driver.findElement(By.partialLinkText("epetiniz"));
        sepeteGit.click();

        //Ürüne ait kontrol kutusunu işaretleyiniz.
        WebElement kontrolKutusu=driver.findElement(By.name("cart_selection[]"));
        if(!kontrolKutusu.isSelected()) {
            kontrolKutusu.click();

        }

        // Ürün miktarını değiştiriniz.
        WebElement urunMiktari = driver.findElement(By.name("quantity"));
        urunMiktari.clear();
        urunMiktari.sendKeys("3");

        Assert.assertEquals("3", urunMiktari.getAttribute("value"));



    }
}
