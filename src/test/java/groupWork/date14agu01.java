package groupWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class date14agu01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-Tarayıcıyı açın ve Amazon'un ana sayfasına gidin.
        driver.get("https://amazon.com.tr/");


        driver.findElement(By.xpath("(//*[@*='button'])[1]")).click();

        //2-Amazon ana sayfasında, arama kutusunu bulun ve "kitap" kelimesini girin.
        driver.findElement(By.xpath("//input[@*='text']")).sendKeys("kitap"+ Keys.ENTER);

        //3-Arama sonuçları sayfasında, ilk ürünün adını ve fiyatını doğrulayın.
        WebElement firtProduct=driver.findElement(By.xpath("(//*[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
        String actualProductName=firtProduct.getText();
        System.out.println("Actual Name : "+actualProductName);
        String expectedProductName="SportPlus Kürek Makinesi, Evlere Uygun, Katlanabilir, Sessiz ve Akıcı Antreman, Akıllı Ekran";
        if (actualProductName.equals(expectedProductName)){
            System.out.println("NAME TEST PASSED");
        }else System.out.println("NAME TEST FAILED");

        double actaulProductPrice=Double.parseDouble(driver.findElement(By.xpath("(//*[@*='a-price-whole'])[1]")).getText());
        System.out.println(actaulProductPrice);

        //buraya kadar cozduk kalanini herkes kendi cozecek

        //4-İlk ürünün bağlantısına tıklayarak ürün sayfasına gidin.
        //5-Ürün sayfasında, kitabın adını, yazarını ve fiyatını kontrol edin.
        //6-Tarayıcıyı kapatın.

    }
}