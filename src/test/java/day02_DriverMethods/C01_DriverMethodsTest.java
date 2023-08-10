package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodsTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //2. yol
        //String amazonUrl ="https://amazon.com";
        //System.out.println(amazonUrl);

        //Sayfa başlığını konsola yazdırınız
        String amazonActualTitle = driver.getTitle();
        System.out.println("Amazon sayfasi basligi  :"+amazonActualTitle);

        //Sayfanın url'sini console a yazdiriniz
        String amazonActualUrl = driver.getCurrentUrl();
        System.out.println("Amazon sayfasi url'si  :"+amazonActualUrl);

        //Techpro sayfasına gidiniz
        driver.get("https://techproeducation.com");
        //2. yol
        //String techproeducationUrl ="https://techproeducation.com";
        //System.out.println(techproeducationUrl);

        //Sayfa başlığını konsola yazdırınız
        String techproActualTitle = driver.getTitle();
        System.out.println("Techproeducation sayfasi basligi  :"+techproActualTitle);

        //Sayfanın url'sini console a yazdiriniz
        String techproActualUrl = driver.getCurrentUrl();
        System.out.println("Techproeducation sayfasi url'si  :"+techproActualUrl);

        System.out.println(driver.getTitle().contains("Amazon"));// true
        System.out.println(driver.getPageSource().contains("Gateway")); //true



    }
}
