package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ManageMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        Driver i olusturduktan sonra maximize yapmamız bizim icin gitmek istedigimiz sayfadaki
        web elementlere daha rahat sorunsuz ulasmamiz icin onemlidir.
        Bunun icin driver i hemen olusturduktan sonra
        manage().window.maximize(); methodunu kullaniriz
        Maximize yaptıktan sonra internetten kaynakli sayfadaki elementler hemen yüklenemeyebilir
        Dolayısıyla sayfaya gittikten sonra bir element e bir buton a tiklamak istedigimizde hemen
        sayfa yuklenmez ise elementi bulamayacagi icin tiklama islemi gerceklesmez
        boylece test fail verir. bunun onune gecmek icin maximize methodundan sonra
        driver'imiza selenium dan gelen implicitly wait atamasi yapariz. bu wait ile sayfanin
        tüm elementlerin olusmasi icin max. bir sure belirtiriz.
         */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Techpro sayfasına gidiniz
        driver.get("https://techproeducation.com");


        //Sayfa basliginin “TechPro” icerdigini test edin
        if (driver.getTitle().contains("TechPro")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");

        driver.close();
        }

    }
}