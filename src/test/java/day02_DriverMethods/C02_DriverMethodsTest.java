package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodsTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


    //1.Techpro sayfasina gidelim.
    String techproeducationUrl ="https://techproeducation.com";
    System.out.println(techproeducationUrl);

    driver.get(techproeducationUrl);


    //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa basligi  :"+driver.getTitle());

        //Sayfa basliginin “TechPro” icerdigini test edin
        if (driver.getTitle().contains("TechPro")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

            //Sayfa adresini(url) yazdirin
        System.out.println("sayfa URL si  :" + driver.getCurrentUrl());

        //Sayfa url’inin “techpro” icerdigini test edin.
        if (driver.getCurrentUrl().contains("techpro")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
    //Sayfa handle degerini yazdirin
        String amazonSayfaHandleDegeri=driver.getWindowHandle();
        System.out.println("Sayfa handle degeri  :" + amazonSayfaHandleDegeri);

        //getWindowHandle methodu ile başka bir pencereye kendimiz isteyerek baska bir pencereye gecis yaptigimizda
        //iki tane pencere acmis olacagiz dolayisiyla ilk actigimiz pencereye gecis yapmak istedigimizde
        //ilk actigimiz pencereden sonra windowhandle degeri ile gecis yaoabiliriz.
        //pencereler arası gecis konusunda bunu detayli olarak gorecegiz. Bir de bir sayfaya gittigimizde
        // bir linke tikladigimizda bizim kontrolumuz disinda yeni bir pencere acilabilir. Bu gibi durumlarda
        //getWindowHandles() methodu ile driver'in acmsi oldugu pencelerelerin handle degerlerini
        //bir list e assign ederiz ve istedigimiz pencereye index ile cok rahat gecis yapabiliriz

    //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        System.out.println(driver.getPageSource());
        System.out.println(driver.getPageSource().contains("Gateway"));

        //Sayfayı kapatin
        driver.close();
        //close methodu driver in en son actigi sayfayi kapatir.
        //driver.quit(); methodu ise bizim actigimiz birden fazla sekme ya da pencerelerin hepsini kapatmak için kullanilir.

    }

}
