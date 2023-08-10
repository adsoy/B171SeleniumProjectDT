package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        //Boş bir driver aç
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Amazon sayfasına gidelim
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();

        //Sayfanın konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu NORMAL : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin olculeri NORMAL   : " + driver.manage().window().getSize());

        //Sayfayi simge durumuna getir
        driver.manage().window().minimize();

        //Simge durumunda 3 saniye bekleyip sayfayi maximize edin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //sayfanın konumu ve boyutlarini maximize durumda yazdirin
        System.out.println("Sayfanin konumu  MAX : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin olculeri  MAX  : " + driver.manage().window().getSize());

        //sayfayı fullscreen yap
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //sayfanın konumu ve boyutlarini fullscreen durumda yazdirin
        Thread.sleep(3000);
        System.out.println("Sayfanin konumu FULL : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin olculeri FULL  : " + driver.manage().window().getSize());

        //Sayfayi kapatin
        driver.close();
    }
}
