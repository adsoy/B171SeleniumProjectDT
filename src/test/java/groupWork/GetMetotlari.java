package groupWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.TestBase;

import java.util.List;

public class GetMetotlari extends TestBase {
    /*
        https://www.kitapyurdu.com/ adresine gidiniz.
        Anasayfanın açıldığını sayfa URL'si ile doğrulayınız.
        Anasayfanın açıldığını sayfa başlığı ile doğrulayınız ("Kitapyurdu, Kitapla buluşmanın en kolay yolu").
        Anasayfada "Haftanın Yayınevi", "En Çok Satılanlar" ve "Ayın Yayınevleri" başlıklarının bulunduğunu doğrulayınız.
        Üye girişi butonunun üzerindeki metnin "Giriş Yap" olduğunu doğrulayınız.
        "Üye Ol" butonunun linkinin "https://www.kitapyurdu.com/index.php?route=account/register" olduğunu doğrulayınız.
        En Çok Satılanlar bölümündeki yazar isimlerinin hepsinin span tagı içerisinde olduğunu doğrulayınız.
        En Çok Satılanlar bölümündeki yazar isimlerinin hepsinin font ailesinin "Arial, Helvetica, sans-serif" olduğunu doğrulayınız.
        Haftanın Yayınevi bölümündeki kitap resimlerinin genişliklerinin 120 olduğunu doğrulayınız.
    */

    @Test
    public void getMetotlariTesti() {
        // Kitap Yurdu sitesine gidilir
        driver.get("https://www.kitapyurdu.com/");

        // URL ile doğrulama yapılır
        String expectedUrl = "https://www.kitapyurdu.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        // Sayfa başlığı ile doğrulama yapılır
        String expectedTitle = "Kitapyurdu, Kitapla buluşmanın en kolay yolu";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        // Anasayfada "Haftanın Yayınevi", "En Çok Satılanlar" ve "Ayın Yayınevleri" başlıklarının bulunduğu doğrulanır
        String pageSource = driver.getPageSource();
        String expectedText = "Haftanın Yayınevi";
        Assert.assertTrue(pageSource.contains(expectedText));

        expectedText = "En Çok Satılanlar";
        Assert.assertTrue(pageSource.contains(expectedText));

        expectedText = "Ayın Yayınevleri";
        Assert.assertTrue(pageSource.contains(expectedText));

        // Üye girişi butonunun üzerindeki metnin "Giriş Yap" olduğu doğrulanır
        WebElement girisButonu = driver.findElement(By.xpath("//div[@class='menu-top-button login']"));
        String girisButonuMetni = girisButonu.getText();
        expectedText = "Giriş Yap";
        Assert.assertEquals(expectedText, girisButonuMetni);

        // "Üye Ol" butonunun linkinin "https://www.kitapyurdu.com/index.php?route=account/register" olduğu doğrulanır
        WebElement uyeOlButonu = driver.findElement(By.linkText("Üye Ol"));
        String uyeOlButonuHref = uyeOlButonu.getAttribute("href");
        expectedText = "https://www.kitapyurdu.com/index.php?route=account/register";
        Assert.assertEquals(expectedText, uyeOlButonuHref);

        // En Çok Satılanlar bölümündeki yazar isimlerinin hepsinin span tagı içerisinde olduğu doğrulanır
        List<WebElement> yazarIsmiListesi = driver.findElements(By.xpath("//span[@class='author line-clamp-2']"));
        for (WebElement yazarIsmi : yazarIsmiListesi){
            Assert.assertEquals("span", yazarIsmi.getTagName());
        }



    }
}