package day04_GetTagNameGetAttribute_Xpath_Css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args)  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//        a.web sayfasına gidin. https://www.amazon.com/
            driver.get("https://www.amazon.com/");

//        b.Search(ara) “city bike” (Arama kutusunu xpath ile locate edelim)
        WebElement aramaKutusu= driver.findElement(By.xpath("//*[@type='text']"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
        /*
        Xpath kullanımına // sembolleri ile baslanir. Bu sembollerden sonra tag name belirtmemiz gerekir.
        Tagname yerine * sembolü kullanabiliriz. bu sembol tagname farketmeksizin anlamına gelir.
        Sonra köşeli parantez açıp kullanacağımız attribute ten önce @ sembolü kullanmalıyız.
        sonrasında da attribute yazilip attribute degeri yazilmalidir ve koseli parantez kapatilir.
        SYNTAX:
            //tagName[@attributeName='attributedegeri']
            //*[@*='attributeDegeri']--> bu kullanimda birden fazla sonuc verirse * koydugumuz yerlere
                                        tagName ve attributeName i belirtmemiz gerekir.
                                        Buna ragmen birden fazla souc verirse o webElement in index ini
                                        asagidaki sekilde belirtiriz.
                                     (//tagName[@attributeName='attributedegeri'])([index]
           Xpath kullanmadigimiz zaman bir webElementin locate'i ile alakalı birden fazla sonuc cikarsa
           butun sonuclari bir list e atip index ile o webElementi handle etmek gerekir.
           Dolayisiyla yukaridaki ornekteki gibi xpath kullaniminda birden fazla sonuc alirsak xpath uzerinden
           index ile bunu cozebiliriz.
         */

//        c.Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
            WebElement aramaSonucu= driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
            System.out.println(aramaSonucu.getText());

            //Sadece sonuc sayisini yazdirin
        String [] sonucSayisi=aramaSonucu.getText().split(" ");
        System.out.println("Sonuc sayisi : "+sonucSayisi[2]);

//        d.Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        driver.findElement(By.xpath("(//h2//a)[1]")).click();

        //xpath alırken direkt tag leri kullanarak da unique sonuc vermezse yukaridaki
        // ornekteki gibi index ile elementi handle edebiliriz.

    //sayfayi kapatın
        driver.close();


    }

}
