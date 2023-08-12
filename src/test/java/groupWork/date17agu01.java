package groupWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class date17agu01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfa Konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutu : "+driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(147,247));
        driver.manage().window().setSize(new Dimension(901,851));


        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Dimension size=new Dimension(901,851);
        System.out.println("size = " + size);

        Point point=new Point(147,247);
        System.out.println("point = " + point);


        Point currentPosition=driver.manage().window().getPosition();
        System.out.println("currentPosition = " + currentPosition);
        Dimension currentSize=driver.manage().window().getSize();
        System.out.println("currentSize = " + currentSize);

        if (currentPosition.equals(point)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        if (currentSize.equals(size)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        //Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //Sayfayi kapatin
        driver.close();


    }

}